package com.gcmobile.security.credentials;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

import com.gcmobile.common.CacheService;

/**
 * 
 * <p>
 * Description:这里写描述<br />
 * </p>
 * 
 * @title RetryLimitHashedCredentialsMatcher.java
 * @package com.gcmobile.security
 * @author zhaowei
 * @version 0.1 2016年1月30日
 */
public class RetryLimitHashedCredentialsMatcher extends HashedCredentialsMatcher {

	private CacheService passwordRetryCache = CacheService.getInstance();

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		String username = (String) token.getPrincipal();
		// retry count + 1
		String count = passwordRetryCache.getString(username);
		AtomicInteger retryCount = null;
		if (count != null) {
			retryCount = new AtomicInteger(Integer.parseInt(count));
		} else {
			retryCount = new AtomicInteger(0);
			passwordRetryCache.put(username, "0");
			passwordRetryCache.expire(username, 60);
		}

		if (retryCount.incrementAndGet() > 5) {
			// if retry count > 5 throw
			throw new ExcessiveAttemptsException();
		}

		passwordRetryCache.put(username, String.valueOf(retryCount));
		passwordRetryCache.expire(username, 60);

		boolean matches = super.doCredentialsMatch(token, info);
		if (matches) {
			// clear retry count
			passwordRetryCache.remove(username);
		}
		return matches;
	}
}
