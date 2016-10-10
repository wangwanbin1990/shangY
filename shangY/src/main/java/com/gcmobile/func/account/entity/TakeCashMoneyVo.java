package com.gcmobile.func.account.entity;

import java.io.Serializable;

/**
 * <p>
 * Description:用于提现申请的Vo<br />
 * </p>
 * 
 * @title TakeCashMoneyVo.java
 * @package com.cxdai.portal.account.vo
 * @author justin.xu
 * @version 0.1 2014年6月19日
 */
public class TakeCashMoneyVo implements Serializable {
	private static final long serialVersionUID = 253259912412431081L;
	/** 提现的用户 */
	private Integer userId;
	/** 提现的金额 */
	private String takeMoney;
	/** 支付密码 */
	private String paypassword;
	/** 提现手续费 */
	private String fee;
	/** 联行号 */
	private Long cnapsCode;
	/** 支行 */
	private String branch;
	/** 银行账户 */
	private String cardNum;
	/** 提现银行ID */
	private Integer bankInfoId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTakeMoney() {
		return takeMoney;
	}

	public void setTakeMoney(String takeMoney) {
		this.takeMoney = takeMoney;
	}

	public String getPaypassword() {
		return paypassword;
	}

	public void setPaypassword(String paypassword) {
		this.paypassword = paypassword;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public Long getCnapsCode() {
		return cnapsCode;
	}

	public void setCnapsCode(Long cnapsCode) {
		this.cnapsCode = cnapsCode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public Integer getBankInfoId() {
		return bankInfoId;
	}

	public void setBankInfoId(Integer bankInfoId) {
		this.bankInfoId = bankInfoId;
	}

}
