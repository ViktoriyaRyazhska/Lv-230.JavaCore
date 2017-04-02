package com.home;

/**
 * Created by kitty on 4/2/17.
 */
public class MyThread extends Thread {

    String text = "";

    MyThread (String text){
        this.text = text;
    }

    public void run() {
        for (int i = 0; i < 5; ++i) {
            System.out.printf(text);
        }
    }
}