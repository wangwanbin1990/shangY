package com.sy.controller.rest.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/3/23.
 */
@ApiModel("基础返回信息")
public class BaseRsp implements Serializable {
    @ApiModelProperty("返回码 1:成功 0:失败")
    private String code = "1";

    @ApiModelProperty("返回信息")
    private String message ="成功";

    public BaseRsp() {

    }
    private BaseRsp(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static final BaseRsp build() {
        return new BaseRsp("1","成功");
    }
    public static final BaseRsp build(String code, String message) {
        return new BaseRsp(code, message);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
