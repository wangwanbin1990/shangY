package com.gcmobile.controller.rest.chinabank.vo;

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
 * @title ${className}
 * @package com.gcmobile.controller.rest.vo.chinabankpay
 */

@ApiModel("报文数据信息")
public class Data implements Serializable{
    @ApiModelProperty("银行卡信息")
    private Card card;

    @ApiModelProperty("交易信息")
    private Trade trade;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Trade getTrade() {
        return trade;
    }

    public void setTrade(Trade trade) {
        this.trade = trade;
    }
}
