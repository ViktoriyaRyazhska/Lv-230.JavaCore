package com.first;

/**
 * Created by Roma on 03.04.2017.
 */
public class Task1 {

    public static void main(String[] args) {
        MyThread mt1 = new MyThread(1000, "Thread 1");
        MyThread mt2 = new MyThread(2000, "Thread 2");

        mt1.start();
        mt2.start();
        try {
            mt1.join();
            mt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
