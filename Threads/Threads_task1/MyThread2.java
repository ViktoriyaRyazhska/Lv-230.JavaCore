package com.home;

/**
 * Created by kitty on 4/2/17.
 */
public class MyThread2 extends Thread{

    Thread t;
    Thread l;
    String text = "";


    MyThread2 (String text, Thread t, Thread l){

        this.text = text;
        this.t = t;
        this.l = l;
    }

    public void run() {
        try {
            t.join();

        } catch (Exception e) {
        }
        try {
            l.join();

        } catch (Exception e) {
        }

        for (int i = 0; i < 5; ++i) {
            System.out.printf(text);
        }
    }
}
