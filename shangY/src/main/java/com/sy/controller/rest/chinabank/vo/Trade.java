package com.sy.controller.rest.chinabank.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * Description:文件描述<br />
 * </p>
 *
 * @author wangwanbin
 * @version 0.1 2016/5/24
 * @title Trade
 * @package com.sy.controller.rest.vo.chinabankpay
 */
@ApiModel(value="交易信息")
public class Trade implements Serializable {
    @ApiModelProperty(value = "交易类型")
    private String type;

    @ApiModelProperty(value = "ID")
    private String ID;

    @ApiModelProperty(value = "交易金额")
    private String amount;

    @ApiModelProperty(value = "交易币种")
    private String currency;

    @ApiModelProperty(value = "交易日期")
    private String date;

    @ApiModelProperty(value = "交易时间")
    private String time;

    @ApiModelProperty(value = "通知地址")
    private String notice;

    @ApiModelProperty(value = "交易备注")
    private String note;

    @ApiModelProperty(value = "交易验证码")
    private String code;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
