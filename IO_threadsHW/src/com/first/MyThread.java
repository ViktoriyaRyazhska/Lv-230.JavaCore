package com.first;


public class MyThread extends Thread {
    private Integer a;
    String message;

    public MyThread(Integer a, String message) {
        this.a = a;
        this.message = message;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

