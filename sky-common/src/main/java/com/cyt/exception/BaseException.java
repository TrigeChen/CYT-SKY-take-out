package com.cyt.exception;

/**
 * ClassName: BaseException
 * Package: com.cyt.exception
 * Description:
 *
 * @Author CYT
 * @Create 2023/11/14 13:14
 * @Version 1.0
 */
public class BaseException extends RuntimeException{
    public BaseException(){

    }
    public BaseException(String msg){
        super(msg);
    }
}

