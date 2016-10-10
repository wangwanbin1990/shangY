package com.gcmobile.controller.rest.chinabank.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Description:文件描述<br />
 * </p>
 *
 * @author wangwanbin
 * @version 0.1 2016/5/24
 * @title Card
 * @package com.gcmobile.controller.rest.vo.chinabankpay
 */
@ApiModel(value="银行卡信息")
public class Card implements Serializable {

    @ApiModelProperty(value="持卡人支付卡号发卡行")
    private String bank;

    @ApiModelProperty(value="持卡人支付卡号卡类型")
    private String type;

    @ApiModelProperty(value="持卡人支付卡号")
    private String No;

    @ApiModelProperty(value="持卡人信用卡有效期")
    private String exp;

    @ApiModelProperty(value="持卡人信用卡校验码")
    private String cvv2;

    @ApiModelProperty(value="持卡人姓名")
    private String name;

    @ApiModelProperty(value="持卡人证件类型")
    private String idType;

    @ApiModelProperty(value="持卡人证件号")
    private String idNo;

    @ApiModelProperty(value="持卡人手机号")
    private String phone;


    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
