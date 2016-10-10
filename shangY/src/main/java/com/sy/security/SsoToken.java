package com.sy.security;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.RememberMeAuthenticationToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SsoToken implements RememberMeAuthenticationToken {
	private static final long serialVersionUID = 8587329689973009598L;
	private static final Logger logger = LoggerFactory.getLogger(SsoToken.class);
	
	private String ticket = null;
	private boolean isRememberMe = false;
	private Integer platform = null;
	private String userIdMD5;
	
	public SsoToken() {
	}

	public SsoToken(String ticket) {
		this.ticket = ticket;
		parser();
	}

	public Object getPrincipal() {
		return this.userIdMD5;
	}

	public Object getCredentials() {
		return this.ticket;
	}

	public boolean isRememberMe() {
		return this.isRememberMe;
	}

	public Integer getPlatform() {
		return this.platform;
	}
	

	public String getUserIdMD5() {
		return userIdMD5;
	}

	public void setUserIdMD5(String userIdMD5) {
		this.userIdMD5 = userIdMD5;
	}

	private void parser() {
		try {
			String decryptTicket = TicketCryptor.decrypt(ticket);
			if (decryptTicket == null) {
				return;
			}
			if (!StringUtils.containsAny(decryptTicket, TicketCryptor.SPLIT)) {
				return;
			}
			String[] arr = StringUtils.split(decryptTicket, TicketCryptor.SPLIT);
			this.setPlatform(Integer.valueOf(arr[arr.length - 2]));
			this.userIdMD5 = String.valueOf(arr[arr.length - 3]);
		} catch (Exception e) {
			logger.error("Ticket can not be resolved [{}]", ticket, e);
		}
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}
}