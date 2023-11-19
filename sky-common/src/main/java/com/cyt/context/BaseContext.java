package com.cyt.context;

/**
 * ClassName: BaseContest
 * Package: com.cyt.context
 * Description:
 *
 * @Author CYT
 * @Create 2023/11/14 13:11
 * @Version 1.0
 */
public class BaseContext {
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();


    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }
}
