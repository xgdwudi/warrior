package com.study.common.constant;

import lombok.Getter;

/**
 * 返回结果类型
 */
@Getter
public enum ResponseCodeEnums {
    /**
     * 成功
     */
    SUCCESS(200, "请求成功"),

    /**
     * 失败
     */
    FAIL(500, "请求失败"),

    USER_NOT_FOUND(1001, "请求数据不存在");

    Integer code;

    String message;

    ResponseCodeEnums(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
