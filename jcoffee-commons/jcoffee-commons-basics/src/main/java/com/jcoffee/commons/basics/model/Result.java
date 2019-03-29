package com.jcoffee.commons.basics.model;

import com.jcoffee.commons.basics.constant.ResultCode;

import java.io.Serializable;

/**
 * @program jcoffee 
 * @description: 统一返回对象 
 * @author: Horng 
 * @create: 2019/03/27 17:19 
 */
public class Result<T> implements Serializable {
    private Integer code;
    private String msg;
    private Boolean success;
    private T data;

    public Result() {
        this.code = ResultCode.SUCCESS.getCode();
        this.msg = ResultCode.SUCCESS.getMsg();
        this.success = true;
        this.data = null;
    }

    public Result(Integer code, String msg, Boolean success, T data) {
        this.code = code;
        this.msg = msg;
        this.success = success;
        this.data = data;
    }

    public Result(Boolean success, Integer code) {
        this.success = success;
        this.code = code;
    }

    public Result(Boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public Result(Boolean success) {
        this.success = success;
    }

    public Result(T data) {
        this.code = ResultCode.SUCCESS.getCode();
        this.msg = ResultCode.SUCCESS.getMsg();
        this.success = true;
        this.data = data;
    }

    public static <T> Result<T> success(){
        return new Result<>();
    }

    public static <T> Result<T> success(T data){
        return new Result<>(data);
    }

    public static <T> Result<T> fail(){
        return new Result<>(ResultCode.OPERATION_FAILED.getCode()
                ,ResultCode.OPERATION_FAILED.getMsg(),false,null);
    }

    public static <T> Result<T> fail(String msg){
        return new Result<>(ResultCode.OPERATION_FAILED.getCode()
                ,msg,false,null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
