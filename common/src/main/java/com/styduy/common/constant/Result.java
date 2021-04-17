package com.styduy.common.constant;

import lombok.Data;

/**
 * 定义返回结果
 * @param <T>
 */
@Data
public class Result<T> {
    /**
     * 状态码
     */
    private int code;
    /**
     * 返回值说明
     */
    private String message;
    /**
     * 结果值
     */
    private T data;

    /**
     *  内部封装数据的方法
     * @param code  状态码
     * @param data  返回数据
     * @return
     */
    private static Result create(int code,String message,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setData(data);
        return result;
    }

    /**
     *  成功的方法,且返回数据
     */
    public static Result OK(Object data){
        return Result.create(ResponseCodeEnums.SUCCESS.getCode(),ResponseCodeEnums.SUCCESS.getMessage(),data);
    }
    /**
     *  成功的方法
     */
    public static Result OK(){
        return Result.create(ResponseCodeEnums.SUCCESS.getCode(),ResponseCodeEnums.SUCCESS.getMessage(),null);
    }
    /**
     *  失败的方法
     */
    public static Result Fail(){
        return Result.create(ResponseCodeEnums.FAIL.getCode(),ResponseCodeEnums.FAIL.getMessage(),null);
    }
    /**
     *  失败的方法
     */
    public static Result Fail(int code,String message){
        return Result.create(code,message,null);
    }
    /**
     *  数据不存在
     */
    public static Result Not_Found(){
        return Result.create(ResponseCodeEnums.USER_NOT_FOUND.code,ResponseCodeEnums.USER_NOT_FOUND.message,null);
    }


}
