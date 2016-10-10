package com.gcmobile.security.oauth2.controller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.as.request.OAuthAuthzRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.error.OAuthError;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.common.message.types.ResponseType;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcmobile.common.CacheService;
import com.gcmobile.security.ShiroUser;
import com.gcmobile.security.UsernamePasswordToken;
import com.gcmobile.security.statics.Constants;
import com.gcmobile.utils.MD5;

/**
 * 
 * <p>
 * Description:这里写描述<br />
 * </p>
 * 
 * @title AuthorizeController.java
 * @package com.gcmobile.func.oauth2.controller
 * @author zhaowei
 * @version 0.1 2016年1月30日
 */
@Controller
public class AuthorizeController {

	private CacheService cache = CacheService.getInstance();

	@RequestMapping("/authorize")
	public Object authorize(Model model, HttpServletRequest request) throws URISyntaxException, OAuthSystemException {
		try {
			// 构建OAuth 授权请求
			OAuthAuthzRequest oauthRequest = new OAuthAuthzRequest(request);

			// 检查传入的客户端id是否正确
			if (!checkClientId(oauthRequest.getClientId())) {
				OAuthResponse response = OAuthASResponse.errorResponse(HttpServletResponse.SC_BAD_REQUEST)
						.setError(OAuthError.TokenResponse.INVALID_CLIENT)
						.setErrorDescription(Constants.INVALID_CLIENT_DESCRIPTION).buildJSONMessage();
				return new ResponseEntity(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));
			}

			Subject subject = SecurityUtils.getSubject();
			// 如果用户没有登录，跳转到登陆页面
			if (!subject.isAuthenticated()) {
				if (!login(subject, request)) {
					OAuthResponse response = OAuthASResponse.errorResponse(HttpServletResponse.SC_BAD_REQUEST)
							.setError(OAuthError.TokenResponse.INVALID_REQUEST)
							.setErrorDescription(Constants.INVALID_AUTH_DESCRIPTION).buildJSONMessage();
					return new ResponseEntity(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));
				}
			}

			ShiroUser user = (ShiroUser) subject.getPrincipal();
			// 生成授权码
			String authorizationCode = null;
			// responseType目前仅支持CODE，另外还有TOKEN
			String responseType = oauthRequest.getParam(OAuth.OAUTH_RESPONSE_TYPE);
			if (responseType.equals(ResponseType.CODE.toString())) {
				OAuthIssuerImpl oauthIssuerImpl = new OAuthIssuerImpl(new MD5Generator());
				authorizationCode = oauthIssuerImpl.authorizationCode();
				// 存入缓存中
				cache.put(authorizationCode, String.valueOf(user.getUserId()));
			}

			// 进行OAuth响应构建
			OAuthASResponse.OAuthAuthorizationResponseBuilder builder = OAuthASResponse.authorizationResponse(request,
					HttpServletResponse.SC_FOUND);
			// 设置授权码
			builder.setCode(authorizationCode);
			// 得到到客户端重定向地址
			String redirectURI = oauthRequest.getParam(OAuth.OAUTH_REDIRECT_URI);
			
			redirectURI = redirectURI == null ? "./accessToken.json" : redirectURI; 

			// 构建响应
			final OAuthResponse response = builder.location(redirectURI).buildQueryMessage();

			// 根据OAuthResponse返回ResponseEntity响应
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(new URI(response.getLocationUri()));
			return new ResponseEntity(headers, HttpStatus.valueOf(response.getResponseStatus()));
		} catch (OAuthProblemException e) {

			// 出错处理
			String redirectUri = e.getRedirectUri();
			if (OAuthUtils.isEmpty(redirectUri)) {
				// 告诉客户端没有传入redirectUri直接报错
				return new ResponseEntity("OAuth callback url needs to be provided by client!!!", HttpStatus.NOT_FOUND);
			}

			// 返回错误消息（如?error=）
			final OAuthResponse response = OAuthASResponse.errorResponse(HttpServletResponse.SC_FOUND).error(e)
					.location(redirectUri).buildQueryMessage();
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(new URI(response.getLocationUri()));
			return new ResponseEntity(headers, HttpStatus.valueOf(response.getResponseStatus()));
		}
	}

	private boolean checkClientId(String clientId) {
		return true;
	}

	private boolean login(Subject subject, HttpServletRequest request) {
//		if ("get".equalsIgnoreCase(request.getMethod())) {
//			return false;
//		}
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			return false;
		}

		// shiro登录
		UsernamePasswordToken token = new UsernamePasswordToken(username, MD5.toMD5(password), Integer.valueOf("1"));

		try {
			subject.login(token);
			return true;
		} catch (Exception e) {
			request.setAttribute("error", "登录失败:" + e.getClass().getName());
			return false;
		}
	}
}