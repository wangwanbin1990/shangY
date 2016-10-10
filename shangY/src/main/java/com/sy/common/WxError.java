package com.sy.common;

/**
 * 微信返回结果类
 * <p>
 * Description:这里写描述<br />
 * </p>
 * 
 * @title WxError.java
 * @package com.cxdai.wx.common
 * @author Wang Bo
 * @version 0.1 2014年11月14日
 */
public class WxError {
	/** 结果码 */
	private String errcode;
	/** 结果 */
	private String errmsg;
	/** 结果id */
	private String msgid;
	/** token */
	private String newToken;

	public String getNewToken() {
		return newToken;
	}

	public void setNewToken(String newToken) {
		this.newToken = newToken;
	}

	public String getMsgid() {
		return msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

}
