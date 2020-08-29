package com.xxxx.commer.enums;

/**
 * 为什么使用枚举类？
 * 1.提升代码的阅读性，避免硬编码。
 * 2.程序解耦
 */
public enum BaseResultEnum {
    // 自定义枚举类
    SUCCESS("1000", "成功"),
    BUSINESS_EXCEPTION("2000", "服务器好像出了点问题"),
    PARMENT_EXCEPTION("3000","参数异常"),
    EXCEPTION("4000", "服务器故障");

    private String code;
    private String message;


    private BaseResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
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
