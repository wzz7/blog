package com.wz.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ：wzh744
 * @date ：Created in 2022/2/22 09:27
 * @description：统一返回值
 */
@Data
@AllArgsConstructor
public class Result {

    private boolean success;

    private int code;

    private String msg;

    private Object data;

    public static Result success(Object data) {
        return new Result(true, 200 , "success", data);
    }

    public static Result fail(int code, String msg) {
        return new Result(false, code, msg, null);
    }

}
