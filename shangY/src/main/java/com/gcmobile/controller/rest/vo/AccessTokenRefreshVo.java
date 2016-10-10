package com.gcmobile.controller.rest.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * <p>
 * Description:登录请求参数<br />
 * </p>
 * 
 * @title LoginVo.java
 * @package com.gcmobile.controller.rest.vo
 * @author zhaowei
 * @version 0.1 2016年3月22日
 */
@ApiModel(value="刷新accessToken请求参数")
public class AccessTokenRefreshVo implements Serializable {

	/** 
	 * @fields serialVersionUID 
	 */ 
	private static final long serialVersionUID = 7037455910255410995L;
	
	/** accessToken **/
	@ApiModelProperty(value = "accessToken")
	private String accessToken;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
}
