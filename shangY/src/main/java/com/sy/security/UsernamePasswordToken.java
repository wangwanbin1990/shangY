package com.sy.security;

public class UsernamePasswordToken extends org.apache.shiro.authc.UsernamePasswordToken {

	/** 
	 * @fields serialVersionUID 
	 */ 
	
	private static final long serialVersionUID = 6482216838824736820L;
	private Integer platform;
	private String deviceSn;

	public UsernamePasswordToken(String username, String password, Integer platform) {
		super(username, password);
		this.platform = platform;
	}
	
	public UsernamePasswordToken(String username, String password, Integer platform, String deviceSn) {
		super(username, password);
		this.platform = platform;
		this.deviceSn = deviceSn;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public String getDeviceSn() {
		return deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}
}
