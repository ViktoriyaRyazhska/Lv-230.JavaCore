package com.home;

/**
 * Created by kitty on 4/4/17.
 */
public class Producer extends Thread {

    String name;
    Storage storage=null;
    Integer product_produced=0;
    Integer speed=0;

    public Producer(String name, Storage s, Integer t1){
        this.name = name;
        this.storage=s;
        this.speed = t1;
    }

    public void run() {
        while(true){
            try {
                Thread.sleep(speed*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!storage.isEmpty() && !storage.isFull()) {
                storage.putProduct();
                ++product_produced;
            } else {
                if (storage.isEmpty()) {
                    System.out.println("Storage is empty. " + product_produced + " products were produced.\n");
                } else {
                    System.out.println("Storage is full. " + product_produced + " products were produced.\n");
                }
                break;
            }
        }
    }
}

