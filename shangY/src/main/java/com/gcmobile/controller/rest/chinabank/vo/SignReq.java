package com.gcmobile.controller.rest.chinabank.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * Description:App网银在线支付请求参数<br />
 * </p>
 *
 * @author wangwanbin
 * @version 0.1 2016/5/27
 * @title ChinabankpayReq
 * @package com.gcmobile.controller.rest.chinabank.vo
 */
public class SignReq {
    @ApiModelProperty(value="持卡人支付卡号发卡行")
    private String cardBank;

    @ApiModelProperty(value="持卡人支付卡号")
    private String cardNo;


    @ApiModelProperty(value="持卡人手机号")
    private String cardPhone;


    @ApiModelProperty(value = "交易金额")
    private String tradeAmount;



    public String getCardBank() {
        return cardBank;
    }

    public void setCardBank(String cardBank) {
        this.cardBank = cardBank;
    }


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardPhone() {
        return cardPhone;
    }

    public void setCardPhone(String cardPhone) {
        this.cardPhone = cardPhone;
    }


    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }


}
