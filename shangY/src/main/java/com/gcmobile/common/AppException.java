package com.gcmobile.common;

/**
 * Created by Administrator on 2016/4/14.
 */
public class AppException extends Exception {

    private String message;
    private String code;

    public AppException(String code, String message) {
        this.message = message;
        this.code = code;
    }

    public AppException(String message) {
        this.message = message;
        this.code = "0";
    }

    public AppException() {
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

