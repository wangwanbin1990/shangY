/**   
 * <p>
 * Description:这里写描述<br />
 * </p>
 * @title User.java
 * @package com.cxdai.wx.security 
 * @author ZHUCHEN
 * @version 0.1 2014年11月5日
 */
package com.sy.security;

/**
 * <p>
 * Description:微信登录用户存储
 * </p>
 * @title User.java
 * @package com.cxdai.wx.security
 * @author ZHUCHEN
 * @version 0.1 2014年11月5日
 */

public class User {

	private Integer wxId;// 关注表的id
	private String openId;// 微信的openId
	private boolean isBind;// 是否绑定用户
	private String userName;// 官网用户名
	private Integer platform;// 平台来源
	private Integer userId;
	private String headImg;
	private String userIdMD5;

	/**
	 * constructer
	 * @param attribute
	 * @param attribute2
	 */
	public User() {
	}

	public User(String openId, Integer wxId, String userName) {
		this.openId = openId;
		this.wxId = wxId;
		this.userName = userName;
	}

	public Integer getWxId() {
		return wxId;
	}

	public void setWxId(Integer wxId) {
		this.wxId = wxId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public boolean isBind() {
		return isBind;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setBind(boolean isBind) {
		this.isBind = isBind;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	
	public String getSsoTicket() {
		return new StringBuilder(10).append(this.getUserIdMD5()).append(TicketCryptor.SPLIT).append(this.platform).toString();
	}

	public String getUserIdMD5() {
		return userIdMD5;
	}

	public void setUserIdMD5(String userIdMD5) {
		this.userIdMD5 = userIdMD5;
	}

}
