package com.home;

/**
 * Created by kitty on 4/4/17.
 */
public class Retailer extends Thread {

    String name;
    Storage storage=null;
    Integer product_consumed=0;
    Integer speed=0;

    public Retailer(String name, Storage s, Integer t){
        this.name = name;
        this.storage = s;
        this.speed = t;
    }

    public void run() {
        while(true){
            try {
                Thread.sleep(speed*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!storage.isEmpty()){
                storage.getProduct();
                ++product_consumed;
            } else {
                System.out.println("Storage is empty. " + product_consumed + " products were consumed.\n");
                break;
            }
        }
    }
}