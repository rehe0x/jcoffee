package com.jcoffee.commons.basics.constant;

public enum ResultCode {
    SUCCESS("Call success.",0),
    OPERATION_FAILED("Failed to operation.", 1),
    ObsjectExists("The object already exists.", 100),
    ObjectNotExist("Object does not exist.", 101),
    InnerError("Inner error.", 102),
    InvalidParameter("Invalid parameter", 103),
    SmsSendFailed("Failed to send sms", 104),
    InvalidSms("Invalid sms.", 105),
    InvalidAccount("Invalid account or password.", 404),
    AccessDenied("Access denied", 403),
    UnknownError("Unknown error.", 999);


    private String msg;
    private Integer code;

    ResultCode(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

}
