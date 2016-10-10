package com.gcmobile.func.account.entity;

import java.io.Serializable;
import java.util.Date;

import com.gcmobile.common.page.BaseCnd;

/**
 * <p>
 * Description:充值记录查询条件<br />
 * </p>
 * 
 * @title RechargeRecordVo.java
 * @package com.cxdai.portal.account.vo
 * @author justin.xu
 * @version 0.1 2014年5月23日
 */
public class RechargeRecordCnd extends BaseCnd implements Serializable {
	private static final long serialVersionUID = -8537943174686481221L;
	private Integer id;
	/** 订单号 */
	private String tradeNo;
	/** 用户id */
	private Integer userId;
	/**
	 * 充值状态
	 */
	private Integer rechargeStatus;

	private Date beginTime;

	private Date endTime;

	public Integer getRechargeStatus() {
		return rechargeStatus;
	}

	public void setRechargeStatus(Integer rechargeStatus) {
		this.rechargeStatus = rechargeStatus;
	}

	/**
	 * 是否锁定记录, 锁定： yes
	 */
	private String lockedRecordYn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
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
