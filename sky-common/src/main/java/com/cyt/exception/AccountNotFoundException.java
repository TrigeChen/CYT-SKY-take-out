package com.cyt.exception;

/**
 * ClassName: AccountNotFoundException
 * Package: com.cyt.exception
 * Description:
 *
 * @Author CYT
 * @Create 2023/11/14 13:16
 * @Version 1.0
 */
public class AccountNotFoundException extends BaseException {

    public AccountNotFoundException() {
    }

    public AccountNotFoundException(String msg) {
        super(msg);
    }

}
