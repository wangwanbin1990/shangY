package com.gcmobile.common.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * Description:处理XSS的过滤器<br />
 * </p>
 * 
 * @title XssFilter.java
 * @package com.common.filter
 * @author qiongbiao.zhang
 * @version 0.1 2014年9月15日
 */
public class XssFilter implements Filter {

	private Set<String> excludesPattern;

	public XssFilter() {
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		String exclusions = config.getInitParameter("exclusions");
		if (exclusions != null && exclusions.trim().length() != 0) {
			this.excludesPattern = new HashSet<String>(Arrays.asList(exclusions.split("\\s*,\\s*")));
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String servletPath = ((HttpServletRequest) request).getServletPath();
		if (isExclusion(servletPath)) {
			chain.doFilter(request, response);
		} else {
			chain.doFilter(new XssHttpServletRequestWrapper((HttpServletRequest) request), response);
		}
	}

	@Override
	public void destroy() {
	}

	private boolean isExclusion(String path) {
		if (this.excludesPattern == null) {
			return false;
		}
		for (String pattern : this.excludesPattern) {
			if (this.matches(pattern, path)) {
				return true;
			}
		}
		return false;
	}

	private boolean matches(String pattern, String source) {
		if (pattern == null || source == null) {
			return false;
		}
		pattern = pattern.trim();
		source = source.trim();
		if (pattern.endsWith("*")) {
			int length = pattern.length() - 1;
			if (source.length() >= length && pattern.substring(0, length).equals(source.substring(0, length))) {
				return true;
			}
		} else if (pattern.startsWith("*")) {
			int length = pattern.length() - 1;
			if (source.length() >= length && source.endsWith(pattern.substring(1))) {
				return true;
			}
		} else if (pattern.contains("*")) {
			int start = pattern.indexOf("*");
			int end = pattern.lastIndexOf("*");
			if (source.startsWith(pattern.substring(0, start)) && source.endsWith(pattern.substring(end + 1))) {
				return true;
			}
		} else if (pattern.equals(source)) {
			return true;
		}
		return false;
	}

}
