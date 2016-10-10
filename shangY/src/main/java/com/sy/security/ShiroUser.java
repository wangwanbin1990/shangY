package com.sy.security;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

import com.sy.utils.StrinUtils;

/**
 * 自定义Authentication对象，使得Subject除了携带用户的登录名外还可以携带更多信息.
 */
@ApiModel(value="当前用户Model")
public class ShiroUser implements Serializable {

	public ShiroUser() {
	}
	@ApiModelProperty(value="用户ID")
	private Integer userId;

	@ApiModelProperty(value="用户ID加密")
	private String userIdMD5;

	@ApiModelProperty(value="手机号")
	private String userName;

	@ApiModelProperty(value="真实姓名")
	private String realname;

	@ApiModelProperty(value="头像")
	private String headImg;

	@ApiModelProperty(value="身份")
	private Integer isFinancialUser;

	@ApiModelProperty(value="平台")
	private Integer platform;

	@ApiModelProperty(value="加密用户名")
	private String userNameEncrypt;
	
	@ApiModelProperty(value="设备ID")
	private String deviceSn;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserIdMD5() {
		return userIdMD5;
	}

	public void setUserIdMD5(String userIdMD5) {
		this.userIdMD5 = userIdMD5;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getUserNameEnc(){
		if(StringUtils.isNotBlank(userName)){
		return userName.substring(0, 3)+"****"+userName.subSequence(userName.length()-4, userName.length());
		}
		return userName;
		
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public Integer getIsFinancialUser() {
		return isFinancialUser;
	}

	public void setIsFinancialUser(Integer isFinancialUser) {
		this.isFinancialUser = isFinancialUser;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public String getSsoTicket() {
		return new StringBuilder(10).append(this.userIdMD5).append(TicketCryptor.SPLIT).append(this.platform).toString();
	}
	
	public String getUserNameEncrypt() {
		userNameEncrypt = this.getUserName();
		userNameEncrypt = StrinUtils.stringEncryptEn(userNameEncrypt);
		return userNameEncrypt;
	}

	public String getDeviceSn() {
		return deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}
	
}
