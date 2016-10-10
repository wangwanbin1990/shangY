package com.sy.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * 
 * <p>
 * Description:Url拦截过滤器<br />
 * </p>
 * 
 * @title UrlInterceptFilter.java
 * @package com.common.filter
 * @author yangshijin
 * @version 0.1 2014年10月24日
 */
public class UrlInterceptFilter implements Filter {
	private final static Logger logger = Logger.getLogger(UrlInterceptFilter.class);

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String path = request.getServletPath();
		String contextPath = request.getContextPath();
		req.setCharacterEncoding("utf-8");
		String url = request.getHeader("Referer");
		if (path.indexOf("/uploadFilenew/") != -1) {
			System.out.println(url + "==========" + path);
			logger.error(url + "==========" + path);
			if (url != null
					&& (url.indexOf("index.xhtml") != -1
					|| url.indexOf("account/approve/realname/display.html") != -1
					|| url.indexOf("page/member/realname/realname_list.xhtml") != -1
					|| url.indexOf("authenticte/realnameappro/main.html") != -1)) {
				System.out.println(url + "--------" + path);
				logger.error(url + "--------" + path);
				arg2.doFilter(req, res);
			} else {
				return;
			}
		} else {
			arg2.doFilter(req, res);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
