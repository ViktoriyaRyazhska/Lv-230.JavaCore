package com.second;

/**
 * Created by Roma on 03.04.2017.
 */
public class Deadlock {
    final static Object deadlock = new Object();

    public static void main(String[] args) throws InterruptedException {
        synchronized (deadlock) {
            Thread t1 = new Thread() {
                public void run() {
                    synchronized (deadlock) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("deadlock");
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            };
            t1.start();
            t1.join();
        }
        System.out.println("deadlock");
    }

}
