package com.sy.func.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * Description:充值Vo<br />
 * </p>
 * 
 * @title TopupMoneyVo.java
 * @package com.cxdai.portal.account.vo
 * @author justin.xu
 * @version 0.1 2014年5月22日
 */
public class TopupMoneyVo implements Serializable {
	private static final long serialVersionUID = -2646373094663655505L;
	/** 银行编号 */
	private String bankcode;
	/** 充值金额 */
	private BigDecimal money;
	/** 支付渠道 信用卡/储蓄卡 */
	private String payChannel;
	/** 支付宝交易流水号 */
	private String trade_no;
	/** 支付宝交易备注 */
	private String remark;
	/** 充值用户id */
	private Integer userId;
	/** 添加ip */
	private String addIp;
	/** 平台来源(1：网页 2、微信 3 安卓 4 IOS) */
	private Integer platform;

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getTrade_no() {
		return trade_no;
	}

	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAddIp() {
		return addIp;
	}

	public void setAddIp(String addIp) {
		this.addIp = addIp;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

}
