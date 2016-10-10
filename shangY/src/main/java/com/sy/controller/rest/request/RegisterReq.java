package com.sy.controller.rest.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * Description:注册<br />
 * </p>
 * 
 * @title RegisterVo.java
 * @package com.base.entity
 * @author wangawnbin
 * @version 0.1 2014年4月11日
 */
@ApiModel("注册请求参数")
public class RegisterReq implements Serializable {
	private static final long serialVersionUID = -5890980057423538506L;

	@ApiModelProperty("手机号")
	private String username;

	@ApiModelProperty("登录密码")
	private String logpassword;

	@ApiModelProperty("手机验证码")
	private String activeCode;

	@ApiModelProperty("平台来源")
	private Integer platform;

	@ApiModelProperty("设备号")
	private String deviceId;
	private String registerDevice;

	public String getRegisterDevice() {
		return registerDevice;
	}

	public void setRegisterDevice(String registerDevice) {
		this.registerDevice = registerDevice;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLogpassword() {
		return logpassword;
	}

	public void setLogpassword(String logpassword) {
		this.logpassword = logpassword;
	}

	public String getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
}