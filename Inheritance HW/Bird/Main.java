package com.home;

public class Main {

    public static void main(String[] args) {

        Bird arr[]= new Bird[5];
        arr[0]= new Eagle();
        arr[1]= new Swallow();
        arr[2]= new Penguin();
        arr[3]= new Kiwi();
        arr[4]= new Eagle();
        Integer i;
        for(i=0;i<arr.length;++i){
                arr[i].fly();
                System.out.println("Has feather " + arr[i].feather);
                System.out.println("Can lay eggs " + arr[i].layEggs);
        }
    }
}
