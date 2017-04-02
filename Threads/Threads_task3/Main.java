package com.home;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread3 t3 = new MyThread3();
        MyThread2 t2 = new MyThread2(t3);
        MyThread1 t1 = new MyThread1(t2);

        t1.start();
    }
}
