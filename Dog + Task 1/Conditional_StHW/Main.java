package com.home;

import java.util.Scanner;

public class Main {
    public enum Error {bad_request, unauthorized, payment_required, forbidden}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Task 1
        //a)
        /*System.out.println("please enter 3 numbers ");
        Double line1 = Double.parseDouble(input.nextLine());
        Double line2 = Double.parseDouble(input.nextLine());
        Double line3 = Double.parseDouble(input.nextLine());
        if(line1>-5 && line1 <5){
            System.out.println("It's true");
        } else {System.out.println("It's false");}
        if(line2>-5 && line2 <5){
            System.out.println("It's true");
        } else {System.out.println("It's false");}
        if(line3>-5 && line3 <5){
            System.out.println("It's true");
        } else {System.out.println("It's false");}

        //b)
        if(line1>line2 && line1>line3){
            System.out.println("Max is " + line1);
        } else
            if (line2>line3){
            System.out.println("Max is " + line2);
            } else {
                System.out.println("Max is " + line3);
            }

        if(line1<line2 && line1< line3){
                System.out.println("Min is " + line1);
        } else
            if(line2<line3){
            System.out.println("Min is " + line2);
            } else {
                System.out.println("Min is " + line3);
            }*/
        //c)

        Error error = null;

        System.out.println("Please enter error code ");
        Integer line = Integer.parseInt(input.nextLine());

        switch(line)
        {
            case 400:
                error= Error.bad_request; break;
            case 401:
                error = Error.unauthorized; break;
            case 402:
                error = Error.payment_required;break;
            case 403:
                error= Error.forbidden; break;
            default:
                System.out.println("No this error");
                System.exit(0);
        }
        System.out.println(error);



	// write your code here
    }
}
