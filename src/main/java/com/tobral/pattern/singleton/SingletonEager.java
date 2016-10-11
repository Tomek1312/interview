package com.tobral.pattern.singleton;

/**
 * Created by SG0214842 on 10/10/2016.
 */
public class SingletonEager {

    private static final SingletonEager singleton = new SingletonEager();

    private SingletonEager(){}


    public static SingletonEager getSingleton() {
        return singleton;
    }
}
