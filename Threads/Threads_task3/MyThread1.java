package com.home;

/**
 * Created by kitty on 4/2/17.
 */
public class MyThread1 extends Thread {

    MyThread2 t=null;

    MyThread1(MyThread2 t){
        this.t=t;
    }

    public void run() {
        t.start();
    }
}
