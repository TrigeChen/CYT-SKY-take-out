package com.cyt.exception;

/**
 * ClassName: AccountLockedException
 * Package: com.cyt.exception
 * Description:
 *
 * @Author CYT
 * @Create 2023/11/14 13:13
 * @Version 1.0
 */
public class AccountLockedException extends BaseException {

    public AccountLockedException() {
    }

    public AccountLockedException(String msg) {
        super(msg);
    }
}
