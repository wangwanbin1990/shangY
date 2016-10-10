package com.sy.common.email.vo;

import java.io.Serializable;

/**
 * <p>
 * Description:发送邮件Vo<br />
 * </p>
 * 
 * @title EmailSendVo.java
 * @package com.cxdai.base.email.vo
 * @author justin.xu
 * @version 0.1 2014年4月17日
 */
public class EmailSendVo implements Serializable {

	private static final long serialVersionUID = -3531851612222097637L;
	/** 邮件标题 */
	private String subject;
	/** 邮件内容 */
	private String content;
	/** 收件人集合 */
	private String[] toUsers;
	/** 抄送人集合 */
	private String[] ccUsers;
	/** 密送人集合 */
	private String[] bccUsers;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String[] getToUsers() {
		return toUsers;
	}

	public void setToUsers(String[] toUsers) {
		this.toUsers = toUsers;
	}

	public String[] getCcUsers() {
		return ccUsers;
	}

	public void setCcUsers(String[] ccUsers) {
		this.ccUsers = ccUsers;
	}

	public String[] getBccUsers() {
		return bccUsers;
	}

	public void setBccUsers(String[] bccUsers) {
		this.bccUsers = bccUsers;
	}

}
