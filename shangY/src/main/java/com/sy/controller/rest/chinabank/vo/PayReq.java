package com.sy.controller.rest.chinabank.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * Description:文件描述<br />
 * </p>
 *
 * @author wangwanbin
 * @version 0.1 2016/5/27
 * @title PayReq
 * @package com.sy.controller.rest.chinabank.vo
 */
public class PayReq extends SignReq{

    @ApiModelProperty(value = "验证码")
    private String activeCode;//

    @ApiModelProperty(value = "交易备注")
    private String tradeNote;

    @ApiModelProperty(value = "ID")
    private String orderNo;

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public String getTradeNote() {
        return tradeNote;
    }

    public void setTradeNote(String tradeNote) {
        this.tradeNote = tradeNote;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
