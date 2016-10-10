package com.gcmobile.common;

import java.io.Serializable;

public class MessageBoxNoToken implements Serializable {

	private static final long serialVersionUID = 1783247125114260781L;
	private String code;
	private String message;

	public MessageBoxNoToken() {

	}

	public MessageBoxNoToken(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static final MessageBoxNoToken build(String code, String message) {

		return new MessageBoxNoToken(code, message);
	}


}
