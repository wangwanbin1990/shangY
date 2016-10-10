package com.sy.security;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.util.CookieGenerator;

public class CookieRetrievingCookieGenerator extends CookieGenerator {

	@Override
	public void setCookieDomain(String cookieDomain) {
		if (!StringUtils.isEmpty(cookieDomain)) {
			super.setCookieDomain(cookieDomain);
		}
	}

	private static final String REQUEST_PARAMETER_REMEMBER_ME = "rememberMe";

	private int rememberMeMaxAge = 7889231;

	public void addCookie(final HttpServletRequest request, final HttpServletResponse response, final String cookieValue) {
		if (!StringUtils.hasText(request.getParameter(REQUEST_PARAMETER_REMEMBER_ME))) {
			super.addCookie(response, cookieValue);
		} else {
			final Cookie cookie = createCookie(cookieValue);
			cookie.setMaxAge(rememberMeMaxAge);
			if (isCookieSecure()) {
				cookie.setSecure(true);
			}
			response.addCookie(cookie);
		}
	}

	public String retrieveCookieValue(final HttpServletRequest request) {
		final Cookie cookie = org.springframework.web.util.WebUtils.getCookie(request, getCookieName());
		return cookie == null ? null : cookie.getValue();
	}

	public void setRememberMeMaxAge(final int maxAge) {
		this.rememberMeMaxAge = maxAge;
	}
}
