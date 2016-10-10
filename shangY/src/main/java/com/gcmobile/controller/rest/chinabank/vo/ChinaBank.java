package com.gcmobile.controller.rest.chinabank.vo;

import com.gcmobile.common.statics.BusinessConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * Description:网银在线请求信息<br />
 * </p>
 *
 * @author wangwanbin
 * @version 0.1 2016/5/24
 * @title ChinaBank
 * @package com.gcmobile.controller.rest.vo.chinabankpay
 */
@ApiModel("请求信息")
public class ChinaBank implements Serializable{
    @ApiModelProperty("版本号")
    private String version = BusinessConstants.ONLINE_PAY_CHINABANK_VERSION;

    @ApiModelProperty("商户号")
    private String merchant = BusinessConstants.ONLINE_PAY_CHINABANK_MERCHANT;

    @ApiModelProperty("终端号")
    private String terminal = BusinessConstants.ONLINE_PAY_CHINABANK_TERMINAL;

    @ApiModelProperty("持卡人数据和交易数据")
    private String data;

    @ApiModelProperty("数据签名")
    private String sign;


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
