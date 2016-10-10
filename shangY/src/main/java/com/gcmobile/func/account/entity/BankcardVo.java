package com.gcmobile.func.account.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="银行卡Model")
public class BankcardVo implements Serializable {

	@ApiModelProperty(value="银行编号")
	private String bankCode;//

	@ApiModelProperty(value="卡号")
	private String cardNum;//

	@ApiModelProperty(value="交易密码")
	private String payPassword;//

	@ApiModelProperty(value="验证码")
	private String activeCode;//

	@ApiModelProperty(value="手机号")
	private String mobile;//
	
	
	private String token;

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public String getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
