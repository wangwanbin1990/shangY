package com.sy.func.account.entity;

import java.io.Serializable;
import java.util.Date;

import com.sy.common.page.BaseCnd;

/**
 * <p>
 * Description:提现记录查询条件<br />
 * </p>
 * 
 * @title CashRecordCnd.java
 * @package com.cxdai.portal.account.vo
 * @author justin.xu
 * @version 0.1 2014年6月18日
 */
public class CashRecordCnd extends BaseCnd implements Serializable {
	private static final long serialVersionUID = -8537943174686481221L;
	private Integer id;
	/** 用户id */
	private Integer userId;
	/**
	 * 是否锁定记录, 锁定： yes
	 */
	private String lockedRecordYn;
	private Integer rechargeStatus;

	private Date beginTime;

	private Date endTime;

	public Integer getRechargeStatus() {
		return rechargeStatus;
	}

	public void setRechargeStatus(Integer rechargeStatus) {
		this.rechargeStatus = rechargeStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLockedRecordYn() {
		return lockedRecordYn;
	}

	public void setLockedRecordYn(String lockedRecordYn) {
		this.lockedRecordYn = lockedRecordYn;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}
