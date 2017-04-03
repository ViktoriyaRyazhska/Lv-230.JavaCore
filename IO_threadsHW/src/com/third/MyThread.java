package com.third;

/**
 * Created by Roma on 03.04.2017.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Thread second = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("second thread ");
                }
                Thread third = new Thread() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("third thread");
                        }
                    }
                };
                third.start();
            }
        };
        second.start();
    }
}
