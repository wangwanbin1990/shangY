package com.sy.controller.rest.vo;

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
 * @package com.sy.controller.rest.vo
 * @author zhaowei
 * @version 0.1 2016年3月22日
 */
@ApiModel(value="登录请求参数")
public class LoginVo implements Serializable {

	/** 
	 * @fields serialVersionUID 
	 */ 
	private static final long serialVersionUID = 7037455910255410995L;
	
	/** 请求类型 **/
	@ApiModelProperty(value="请求类型，1：密码登录；2：验证码登录", required = true)
	private int requestType;
	
	/** 用户名 */
	@ApiModelProperty(value="用户名", required = true)
	private String username;
	
	/** 密码 */
	@ApiModelProperty(value="登录密码，如果为验证码登录，该参数为空", required = false)
	private String password;
	
	/** 验证码 */
	@ApiModelProperty(value="登录验证码，如果为密码登录，该参数为空", required = false)
	private String verificationCode;
	
	/** 平台来源 */
	@ApiModelProperty(value="平台来源，安卓：1；IOS：2", required = true)
	private int platform;
	
	/** 设备ID */
	@ApiModelProperty(value="设备ID，每次登陆必须传入", required = true)
	private String deviceSn;
	@ApiModelProperty(value="设备名 安卓包括厂商和设备", required = true)
	private String platformName;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public int getPlatform() {
		return platform;
	}

	public void setPlatform(int platform) {
		this.platform = platform;
	}

	public String getDeviceSn() {
		return deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public int getRequestType() {
		return requestType;
	}

	public void setRequestType(int requestType) {
		this.requestType = requestType;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
}
