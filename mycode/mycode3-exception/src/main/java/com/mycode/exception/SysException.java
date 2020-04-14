package com.mycode.exception;

/**
 * 自定义的一个异常类
 * @author 尔康
 */
public class SysException extends Exception{

    /**存储提示信息
     *
     */
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
