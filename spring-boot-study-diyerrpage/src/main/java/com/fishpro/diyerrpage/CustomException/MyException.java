package com.fishpro.diyerrpage.CustomException;

/**
 * 自定义的异常类型
 *
 * @author guoheng
 * @date 2021/10/26
 */
public class MyException extends RuntimeException {
    int status;
    String msg;

    public MyException(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
