package com.gcmobile.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gcmobile.utils.CSRFTokenManager;
import com.gcmobile.utils.WxUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Map;

@ApiModel(value = "返回消息Model")
public class MessageBox implements Serializable {

	private static final long serialVersionUID = -770558557256525814L;
	
	@ApiModelProperty(value="消息code，1：成功；0：失败", required=true)
	private String code;
	
	@ApiModelProperty(value="消息内容，如果请求失败这里提示具体的错误信息", required=true)
	private String message;
	
	@ApiModelProperty(hidden=true)
	private String newToken;
	
	@JsonIgnore
	@ApiModelProperty(hidden=true)
	private Map<String, String> result;

    @JsonIgnore
	@ApiModelProperty(hidden=true)
	private Integer counter;
	
	public MessageBox() {

	}

	public MessageBox(String code, String message) {
		this.code = code;
		this.message = message;
		this.newToken = WxUtils.setRepeat();
	}
	
	public MessageBox(String code, String message, String token) {
		this.code = code;
		this.message = message;
		this.newToken = token;
	}
	
	public MessageBox(String code, String message, String newToken,
			Integer counter) {
		super();
		this.code = code;
		this.message = message;
		this.newToken = newToken;
		this.counter = counter;
	}

	public MessageBox(String code, String message, Map<String, String> result) {
		this.code = code;
		this.message = message;
		this.result = result;
	}

	public static final MessageBox build(String code, String message, boolean flag) {
		if (!flag) {
			return new MessageBox(code, message);
		} else {
			return new MessageBox(code, message, WxUtils.setRepeat());
		}
	}

	public static final MessageBox buildForCount(String code, String message) {
		return new MessageBox(code, message, WxUtils.setRepeat(), CSRFTokenManager.getCounter());
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

	public Map<String, String> getResult() {
		return result;
	}

	public void setResult(Map<String, String> result) {
		this.result = result;
	}

	public static final MessageBox build(String code, String message) {
		return new MessageBox(code, message, WxUtils.setRepeat());
	}

	public static final MessageBox buildForCounter(String code, String message) {

		return new MessageBox(code, message, 0);
	}

	public static final MessageBox build(String code, String message, Map<String, String> result) {
		return new MessageBox(code, message, result);
	}

	public MessageBox(String code, String message, Integer counter) {
		super();
		this.code = code;
		this.message = message;
	}

	public String getNewToken() {
		return newToken;
	}

	public void setNewToken(String newToken) {
		this.newToken = newToken;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

}
