package com.gcmobile.func.account.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 我的账户-安全中心参数类
 * <p>
 * Description:这里写描述<br />
 * </p>
 * 
 * @title SafeCenterVo.java
 * @package com.cxdai.wx.account.vo
 * @author ZHUCHEN
 * @version 0.1 2014年11月3日
 */
@ApiModel("安全中心控制类")
public class SafeCenterVo implements Serializable {

	private static final long serialVersionUID = -4010048561890513448L;

	@ApiModelProperty("邮箱")
	private String email;

	@ApiModelProperty("真实姓名")
	private String realname;

	@ApiModelProperty("身份证号码")
	private String idcard;

	@ApiModelProperty("手机号")
	private String mobile;

	@ApiModelProperty("短信验证码")
	private String activeCode;

	@ApiModelProperty("登录旧密码")
	private String oldPwd;

	@ApiModelProperty("登录新密码")
	private String newPwd;

	@ApiModelProperty("确认新密码")
	private String reNewPwd;

	@ApiModelProperty("交易密码")
	private String paypassword;
	
	@JsonIgnore
	@ApiModelProperty(hidden = true)
	private String token;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public String getReNewPwd() {
		return reNewPwd;
	}

	public void setReNewPwd(String reNewPwd) {
		this.reNewPwd = reNewPwd;
	}

	public String getPaypassword() {
		return paypassword;
	}

	public void setPaypassword(String paypassword) {
		this.paypassword = paypassword;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
