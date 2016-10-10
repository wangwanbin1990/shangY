package com.gcmobile.security;

import static com.gcmobile.security.ShiroConstants.permissions;
import static com.gcmobile.security.ShiroConstants.roles;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class ShiroRealm extends AuthorizingRealm {


	public ShiroRealm() {
		setAuthenticationTokenClass(UsernamePasswordToken.class);
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;

/*
		MemberVo memberVo = memberMapper.queryMemberByloginname(usernamePasswordToken.getUsername());
		if (memberVo == null) {
			throw new UnknownAccountException("Unknown username [" + usernamePasswordToken.getUsername() + "]");
		}

		ShiroUser user = new ShiroUser();
		user.setUserId(memberVo.getId());
*/

		return new SimpleAuthenticationInfo(new ShiroUser(), "password", getName());
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		ShiroUser shiroUser = (ShiroUser) principalCollection.getPrimaryPrincipal();

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

		info.addRole(roles[shiroUser.getIsFinancialUser()]);
		info.addStringPermissions(permissions.get(roles[shiroUser.getIsFinancialUser()]));
		return info;
	}

}
