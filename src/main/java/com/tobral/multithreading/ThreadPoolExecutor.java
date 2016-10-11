package com.tobral.multithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor {

    private static long next = 0;


    private static final ExecutorService pool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
        for (int i = 0; i < 5; i++) {
            pool.submit(() -> {

                while (true){
                    System.out.println(threadPoolExecutor.getNext());
                }


            });

        }
    }


    public  long getNext() {
        return next++;
    }
}
