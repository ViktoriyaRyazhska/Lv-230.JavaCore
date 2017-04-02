package com.home;

/**
 * Created by kitty on 4/2/17.
 */
public class MyThread2 extends Thread {
    //Thread k=null;

    MyThread3 k=null;

    MyThread2(MyThread3 k){
        this.k=k;
    }

public void run (){
        for(int i=0; i<3; ++i) {
            System.out.println("Thread number two\n");
        }
        k.start();

    }

}
