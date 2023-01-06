package com.tony.demo.singleton.controller;


/**
 * 用静态内部内的形式实现懒汉式单例
 * （线程安全，解决饿汉式单例的内存浪费问题，比双重检查快，因为不用加锁）
 */

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }

    public static final StaticInnerClassSingleton getInstance() {
        return Holder.singleton;
    }

    //静态内部类，未被使用，不会加载
    private static class Holder {
        private static final StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }


}
