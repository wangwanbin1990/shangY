package com.sy.security;

public class AccessToken extends SsoToken {

	private static final long serialVersionUID = 8587329689973009598L;

	private Integer userId = null;
	private boolean isRememberMe = false;
	private String deviceSn;
	
	public AccessToken(Integer userId, Integer platform, String deviceSn) {
		this.userId = userId;
		this.setPlatform(platform);
		this.deviceSn = deviceSn;
	}

	@Override
	public Object getPrincipal() {
		return this.userId;
	}

	public Object getCredentials() {
		return this.userId;
	}

	public boolean isRememberMe() {
		return this.isRememberMe;
	}

	public String getDeviceSn() {
		return deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}
	
}