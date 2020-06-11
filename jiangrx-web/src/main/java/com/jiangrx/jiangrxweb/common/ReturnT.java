package com.jiangrx.jiangrxweb.common;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 23:09 2020/6/8
 */
@ApiModel("返回结果实体类")
public class ReturnT<T> implements Serializable {

    public static final long serialVersionUID = 42L;

    private static final String SUCCESS_CODE = "000";

    private static final String FAIL_CODE = "001";

    private String code;

    private String msg;

    private T data;

    public static final ReturnT<String> SUCCESS = new ReturnT<>(SUCCESS_CODE, "");

    public static final ReturnT<String> FAIL = new ReturnT<>(FAIL_CODE, "");

    private ReturnT(String msg) {
        this.code = SUCCESS_CODE;
        this.msg = msg;
    }

    public ReturnT(T data) {
        this.code = SUCCESS_CODE;
        this.msg = "";
        this.data = data;
    }

    public ReturnT(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ReturnT(String msg, T data) {
        this.code = SUCCESS_CODE;
        this.msg = msg;
        this.data = data;
    }

    public ReturnT(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static ReturnT<String> okDesc(String msg) {
        return new ReturnT<>(msg);
    }

    public static ReturnT<String> failDesc(String msg) {
        return new ReturnT<>(FAIL_CODE, msg);
    }

    public static ReturnT okData(Object data) {
        return new ReturnT<>(data);
    }

    public static ReturnT ok(String msg, Object data) {
        return new ReturnT<>(msg, data);
    }

}
