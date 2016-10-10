package com.sy.func.account.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@ApiModel("实名认证控制类")
public class RealnameVo implements Serializable{
	private static final long serialVersionUID = 5419427508645872478L;

	@ApiModelProperty("真实姓名")
	private String realname;

	@ApiModelProperty("身份证号码")
	private String idcard;
	
	@ApiModelProperty("手机号")
	private String mobile;
	
	@ApiModelProperty("身份证扫描1（正面）")
	private String pic1;
	
	@ApiModelProperty("身份证扫描2（反面）")
	private String pic2;
	
	@ApiModelProperty("籍贯")
	private String nativeplace;
	
	@ApiModelProperty("民族")
	private String nation;
	
	@ApiModelProperty("证件类型")
	private String cardtype;
	
	@ApiModelProperty("性别")
	private String sex;
	
	@ApiModelProperty("生日")
	private String birthday;
	
	@JsonIgnore
	@ApiModelProperty(hidden = true)
	private String token;

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

	public String getPic1() {
		return pic1;
	}

	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}

	public String getPic2() {
		return pic2;
	}

	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}

	public String getNativeplace() {
		return nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
