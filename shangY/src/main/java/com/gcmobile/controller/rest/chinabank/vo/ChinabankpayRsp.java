package com.gcmobile.controller.rest.chinabank.vo;

import com.gcmobile.controller.rest.response.BaseRsp;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * Description:文件描述<br />
 * </p>
 *
 * @author wangwanbin
 * @version 0.1 2016/5/27
 * @title ${className}
 * @package com.gcmobile.controller.rest.vo.chinabankpay
 */
public class ChinabankpayRsp extends BaseRsp {

    @ApiModelProperty(value = "交易信息")
    private Trade trade;

    public Trade getTrade() {
        return trade;
    }

    public void setTrade(Trade trade) {
        this.trade = trade;
    }
}
