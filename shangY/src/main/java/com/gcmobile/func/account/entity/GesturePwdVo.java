package com.gcmobile.func.account.entity;

import java.util.Date;

public class GesturePwdVo {

	private Integer userId;// 用户ID
	private String devicdSn;// 设备ID
	private Integer isOpen;//手势是否开启
	private String pwd;// 手势密码
	private Integer isSafeExit;//是否安全退出
	private Date addTime;// 创建时间
	private Integer addUser;// 创建人
	private String lastModifyTime;// 修改时间
	private String lastModifyUser;// 修改人
	private Integer modifyUserType;//人员类型
	private String addIp; //IP地址
	private Integer platForm; //平台来源
	private String userName; //用户名字
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getIsOpen() {
		return isOpen;
	}
	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getIsSafeExit() {
		return isSafeExit;
	}
	public void setIsSafeExit(Integer isSafeExit) {
		this.isSafeExit = isSafeExit;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Integer getAddUser() {
		return addUser;
	}
	public void setAddUser(Integer addUser) {
		this.addUser = addUser;
	}
	public String getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(String lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public String getLastModifyUser() {
		return lastModifyUser;
	}
	public void setLastModifyUser(String lastModifyUser) {
		this.lastModifyUser = lastModifyUser;
	}
	public Integer getModifyUserType() {
		return modifyUserType;
	}
	public void setModifyUserType(Integer modifyUserType) {
		this.modifyUserType = modifyUserType;
	}
	public String getAddIp() {
		return addIp;
	}
	public void setAddIp(String addIp) {
		this.addIp = addIp;
	}
	public Integer getPlatForm() {
		return platForm;
	}
	public void setPlatForm(Integer platForm) {
		this.platForm = platForm;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDevicdSn() {
		return devicdSn;
	}
	public void setDevicdSn(String devicdSn) {
		this.devicdSn = devicdSn;
	}
	
	
}
