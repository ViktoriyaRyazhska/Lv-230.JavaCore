package com.homework;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainArr {

    public static void main(String[] args) {

        //Task1
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter month number ");
        Integer line = Integer.parseInt(input.nextLine());

        Integer i;
        Integer k = null;
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Number of days of this month is " + month_days[line-1]);*/

        //Task 2
        /*Scanner input = new Scanner(System.in);
        Integer arr [] = new Integer[10];
        Integer i;
        for(i=0; i<arr.length; ++i){

            System.out.println("Please enter number ");
            arr[i] = Integer.parseInt(input.nextLine());
        }

        Integer v = 0;
        for(i=0; i<5; ++i){
            if(arr[i]<0){
                v = 1;
                for (i = 5; i < 10; ++i) {
                    v *= arr[i];
                }
                break;
            }
            v+=arr[i];
        }

        System.out.println("Equal " + v);*/

        //Task 3
        /*Scanner input = new Scanner(System.in);
        Integer arr[]= new Integer[5];
        Integer i;
        Integer p=0;
        for(i=0;i<arr.length; ++i){
            System.out.println("Please enter number ");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        for (i=0; i<arr.length; ++i){
            if(arr[i]>0){p++;
            }
            if(p==2){System.out.println("Ok " + arr[i] + " On place " + i);
            break;
            }

        }*/
        // Task 4
        Scanner input = new Scanner(System.in);

        Integer[] arr;
        Integer i;
        Integer gin=1;
        Integer line=1;
        while (line >=0){
            gin*=line;
            System.out.println("Enter number ");
            line = Integer.parseInt(input.nextLine());
        }
        System.out.println("Product is " + gin);
    }
}
