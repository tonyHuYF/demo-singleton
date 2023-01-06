package com.tony.demo.singleton.controller;


/**
 * 饿汉式单例模式
 * (优点：没有加锁，执行效率高，线程安全)
 * (缺点：造成内存浪费，因为在对象没有使用就已经初始化了)
 */

public class HungrySingleton {
    //类初始化时顺便进行对象实例化
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

}
