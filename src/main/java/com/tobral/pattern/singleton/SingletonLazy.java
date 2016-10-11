package com.tobral.pattern.singleton;

/**
 * Created by SG0214842 on 10/10/2016.
 */
public class SingletonLazy {

    private static SingletonLazy singleton;


    private SingletonLazy() {
    }

    public SingletonLazy getSingleton() {
        if (singleton == null) {

            synchronized (this) {
                if (singleton == null)
                    singleton = new SingletonLazy();
            }

        }

        return singleton;
    }
}
