package com.homework;

import java.util.Scanner;

public class MainCar {

    public static void main(String[] args) {
        Car car1 = new Car("limusine", 1995, 15000);
        Car car2 = new Car("sidan", 2003, 10000);
        Car car3 = new Car("sport_car", 2016, 40000);
        Car car4 = new Car("hatchback", 2008, 40000);

        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter year of production ");
        int line = Integer.parseInt(input.nextLine());*/

        Car arr[] = {new Car("limusine", 1995, 15000),
                new Car("sidan", 2003, 10000),
                new Car("sport_car", 2016, 40000),
                new Car("hatchback", 2008, 40000)};
        int i;
        /*for(i=0; i<arr.length; ++i){
            if(line == arr[i].getYear()){

                System.out.println("Year of production models like a " + arr[i].getModel());
            }
        }*/

        Car tmp;
        for(i=0; i<arr.length; ++i){
            for (int j = i + 1; j < arr.length; j++) {
            if (arr[i].getYear() < arr[j].getYear()) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
        for(i=0; i<arr.length; ++i){

                System.out.println("Year of production models like a " + arr[i].getModel());
            }
        }
    }

