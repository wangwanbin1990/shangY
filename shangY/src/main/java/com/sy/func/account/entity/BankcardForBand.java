package com.sy.func.account.entity;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="银行卡解绑Model")
public class BankcardForBand  extends BankcardVo{
	
	@ApiModelProperty(value="交易金额")
	private BigDecimal money;

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	

}
