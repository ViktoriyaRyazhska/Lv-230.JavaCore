package com.home;

/**
 * Created by kitty on 4/4/17.
 */
public class Storage {

    private Integer capacity=0;
    private Integer maxCapacity=50;


    public Storage(Integer capacity){
        this.capacity = capacity;
    }

    public void putProduct(){
        ++capacity;
        System.out.println("Put: " + this);
    }

    public void getProduct(){
        --capacity;
        System.out.println("Get: " + this);
    }

    public Integer getCapacity(){
        return capacity;
    }

    public boolean isFull (){
        return capacity==maxCapacity;
    }

    public boolean isEmpty (){
        return capacity==0;

    }

    @Override
    public String toString(){
        return "Actual capacity is [" + capacity + " goods]";
    }
}
