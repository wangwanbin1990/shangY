package com.sy.security;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;

public class SsoSubjectFactory extends DefaultWebSubjectFactory {

	public Subject createSubject(SubjectContext context) {
		if (context.isAuthenticated()) {
			AuthenticationToken token = context.getAuthenticationToken();

			if ((token != null) && ((token instanceof SsoToken))) {
				SsoToken ssoToken = (SsoToken) token;

				if (ssoToken.isRememberMe()) {
					context.setAuthenticated(false);
				}
			}
		}
		return super.createSubject(context);
	}
}