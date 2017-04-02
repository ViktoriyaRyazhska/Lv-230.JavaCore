package com.home;

import java.util.regex.*;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("Hello John\n");
        MyThread t2 = new MyThread("I like to move it\n");
        MyThread2 t3 = new MyThread2("How much is the fish?\n", t1, t2);

        t3.start();
        t1.start();
        t2.start();




    }
}
