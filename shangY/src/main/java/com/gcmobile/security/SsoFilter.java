package com.gcmobile.security;

import static org.apache.shiro.web.util.WebUtils.toHttp;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gcmobile.common.CacheService;

public class SsoFilter extends PathMatchingFilter {
	private static final Logger log = LoggerFactory.getLogger(SsoFilter.class);

	private CookieRetrievingCookieGenerator cookieRetrievingCookieGenerator;
	
	private CacheService cache = CacheService.getInstance();
	
	private final String clientId = "c1ebe466-1cdc-4bd3-ab69-77c3561b9dee";
	private final String clientSecret = "d8346ea2-6017-43ed-ad68-19c0f971738b";

	public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		return onAccessDenied(request, response, mappedValue);
	}

	protected boolean onAccessDenied(ServletRequest request, ServletResponse response, Object mappedValue) {
		try {
			AuthenticationToken token = createToken(request, response);
			
			if (token != null) {
/*				Subject subject = getSubject(request, response);
				
				subject.login(token);

				ShiroUser shiroUser = (ShiroUser) subject.getPrincipal();
				LoginCnd loginCnd = new LoginCnd();
				loginCnd.setUserId(shiroUser.getUserId());
				loginCnd.setUserName(shiroUser.getUserName());
				loginCnd.setIp(getRealIpAddr(toHttp(request)));
				loginCnd.setSessionId(toHttp(request).getSession().getId());
				loginCnd.setPlatform(shiroUser.getPlatform());
				memberService.saveLogin(loginCnd);

				log.info("login via sso... [username : " + shiroUser.getUserName() + "]");*/
			}
		} catch (Exception e) {
			log.error("sso filter exception.", e);
			logout(request, response);
			removeCookie(request, response);
		}
		return true;
	}

	protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
		String ticket = cookieRetrievingCookieGenerator.retrieveCookieValue(toHttp(request));
		Subject subject = getSubject(request, response);
		
		HttpServletRequest http = toHttp(request);
		String accessToken = http.getHeader("accessToken");
		
		AuthenticationToken token = null;
		if (StringUtils.isNotBlank(accessToken)) {
			// 访问token不为空，先验证客户端ID，再验证客户端秘钥
			if (checkClientId(http) && checkClientSecret(http) && cache.existKey(accessToken)) {
				Integer userId = Integer.parseInt(cache.getMapValue(accessToken, "userId"));
				Integer platform = Integer.parseInt(cache.getMapValue(accessToken, "platform"));
				String deviceSn = cache.getMapValue(accessToken, "deviceSn");
				token = new AccessToken(userId, platform, deviceSn);
				Integer authedUserId = subject.isAuthenticated() ? ((ShiroUser) subject.getPrincipal()).getUserId() : null;
				// 如果已经登录则返回空
				if (authedUserId != null && authedUserId.intValue() == userId.intValue()) {
					return null;
				}
			}
		} else if (StringUtils.isNotBlank(ticket)) {
			token = new SsoToken(ticket);
			String cookieUserIdMD5 = (String) ((SsoToken)token).getUserIdMD5();
			String shiroUserIdMD5 = subject.isAuthenticated() ? ((ShiroUser) subject.getPrincipal()).getUserIdMD5() : null;
			if (shiroUserIdMD5 != null && shiroUserIdMD5.equals(cookieUserIdMD5)) {
				return null;
			}
		}

		if (token == null && subject.isAuthenticated()) {
			logout(request, response);
		}

		return token;
	}

	protected void logout(ServletRequest request, ServletResponse response) {
		try {
			getSubject(request, response).logout();
		} catch (Exception e) {
		}
	}

	protected void removeCookie(ServletRequest request, ServletResponse response) {
		try {
			cookieRetrievingCookieGenerator.removeCookie(toHttp(response));
		} catch (Exception e) {
		}
	}

	protected Subject getSubject(ServletRequest request, ServletResponse response) {
		return SecurityUtils.getSubject();
	}
	
	private boolean checkClientId(HttpServletRequest request) {
		return clientId.equalsIgnoreCase(request.getHeader("clientId"));
	}
	
	private boolean checkClientSecret(HttpServletRequest request) {
		return clientSecret.equalsIgnoreCase(request.getHeader("clientSecret"));
	}

	public void setCookieRetrievingCookieGenerator(CookieRetrievingCookieGenerator cookieRetrievingCookieGenerator) {
		this.cookieRetrievingCookieGenerator = cookieRetrievingCookieGenerator;
	}
}