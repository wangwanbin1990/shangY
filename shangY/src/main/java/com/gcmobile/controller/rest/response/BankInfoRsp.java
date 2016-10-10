package com.gcmobile.controller.rest.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2016/4/8.
 */
@ApiModel("银行卡信息")
public class BankInfoRsp extends BaseRsp{
    @ApiModelProperty("银行代码")
    private String bankCode;

    @ApiModelProperty("银行名称")
    private String bankName;

    @ApiModelProperty("银行卡号")
    private String cardNum;

    @ApiModelProperty("状态")
    private Integer status;

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
