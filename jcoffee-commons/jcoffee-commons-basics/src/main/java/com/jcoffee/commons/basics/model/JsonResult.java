package com.jcoffee.commons.basics.model;

import com.jcoffee.commons.basics.constant.ResultCode;

import java.io.Serializable;

/**
 * @program jcoffee 
 * @description: 统一返回对象 
 * @author: Horng 
 * @create: 2019/03/27 17:19 
 */
public class JsonResult<T> implements Serializable {
    private Integer code;
    private String msg;
    private Boolean success;
    private T data;

    public JsonResult() {
        this.code = ResultCode.SUCCESS.getCode();
        this.msg = ResultCode.SUCCESS.getMsg();
        this.success = true;
        this.data = null;
    }

    public JsonResult(Integer code, String msg, Boolean success, T data) {
        this.code = code;
        this.msg = msg;
        this.success = success;
        this.data = data;
    }

    public JsonResult(Boolean success,Integer code) {
        this.success = success;
        this.code = code;
    }

    public JsonResult(Boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public JsonResult(Boolean success) {
        this.success = success;
    }

    public JsonResult(T data) {
        this.code = ResultCode.SUCCESS.getCode();
        this.msg = ResultCode.SUCCESS.getMsg();
        this.success = true;
        this.data = data;
    }

    public static <T> JsonResult<T> success(){
        return new JsonResult<>();
    }

    public static <T> JsonResult<T> success(T data){
        return new JsonResult<>(data);
    }

    public static <T> JsonResult<T> fail(){
        return new JsonResult<>(ResultCode.OPERATION_FAILED.getCode()
                ,ResultCode.OPERATION_FAILED.getMsg(),false,null);
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
