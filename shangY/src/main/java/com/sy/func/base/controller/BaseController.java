package com.sy.func.base.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.httpclient.HttpClient;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.sy.security.ShiroUser;
import com.sy.utils.DateUtils;
import com.sy.utils.WxUtils;

/**
 * 复制于官网的basecontroller
 * <p>
 * 修改了三块：1.增加转发action，2.增加httpclient的获取 3.增加权限检查方法
 * </p>
 * 
 * @title BaseController.java
 * @package com.cxdai.wx.base.controller
 * @author ZHUCHEN
 * @version 0.1 2014年11月2日
 */
public abstract class BaseController {
	private static final Logger logger = Logger.getLogger(BaseController.class);

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(DateUtils.getFormat(DateUtils.YMD_DASH), true)); // true:允许输入空值,false:不能为空值
	}

	protected ModelAndView forword(String viewName) {
		return new ModelAndView(viewName);
	}

	protected ModelAndView redirectAction(String viewName) {
		return new ModelAndView("redirect:" + viewName);
	}

	protected ModelAndView forwardAction(String viewName) {
		return new ModelAndView("forward:" + viewName);
	}

	protected ModelAndView forword(String viewName, String modelName, Object modelObject) {
		return new ModelAndView(viewName, modelName, modelObject);
	}

	protected ModelAndView forword(String viewName, Map<String, ?> modelMap) {
		return new ModelAndView(viewName, modelMap);
	}

	protected ModelAndView redirect(String viewName) {
		return new ModelAndView("redirect:" + viewName);
	}

	protected ModelAndView redirect(String viewName, String modelName, Object modelObject) {
		return new ModelAndView("redirect:" + viewName, modelName, modelObject);
	}

	protected ModelAndView redirect(String viewName, Map<String, ?> modelMap) {
		return new ModelAndView("redirect:" + viewName, modelMap);
	}

	protected HttpServletRequest currentRequest() {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		return ((ServletRequestAttributes) requestAttributes).getRequest();
	}

	protected HttpSession currentSession() {
		return currentRequest().getSession();
	}

	protected void stackTraceError(Logger logger, Throwable e) {
		logger.error(null, e);
	}

	protected String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	protected HttpClient getClient() {
		HttpClient client = (HttpClient) currentSession().getAttribute("client");
		if (client == null) {
			client = new HttpClient();
			client.getHttpConnectionManager().closeIdleConnections(30 * 60 * 1000);
			currentSession().setAttribute("client", client);
		}
		return client;
	}

	/**
	 * 获取当前登录用户
	 * <p>
	 * Description:这里写描述<br />
	 * </p>
	 * 
	 * @author ZHUCHEN
	 * @version 0.1 2014年11月6日
	 * @return User
	 */
	protected ShiroUser currentUser() {
		try {
			return (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}

	protected String encodeURL(String input) {
		return WxUtils.encodeURL(input);
	}

	
	protected boolean isLogin() {
		// return
		// !CollectionUtils.isEmpty(SecurityUtils.getSubject().getPrincipals());
		return SecurityUtils.getSubject().isAuthenticated();
	}
}