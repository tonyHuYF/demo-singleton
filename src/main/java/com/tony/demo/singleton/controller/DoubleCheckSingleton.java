package com.tony.demo.singleton.controller;

/**
 * 双重检查版懒汉式单例
 * （线程安全，解决饿汉式单例的内存浪费问题）
 */

public class DoubleCheckSingleton {
    //volatile关键字保证了可见性
    private volatile static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        //一重检查：检查实例，如果不存在，进入同步代码块
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                //二重检查：进入同步代码块，再次检查，如果为null，则创建实例
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
