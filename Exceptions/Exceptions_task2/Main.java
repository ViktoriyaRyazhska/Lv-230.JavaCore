package com.home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberFormatException{

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        try {
            Integer i = Integer.parseInt(input.nextLine());
            Number n = new Number(i);
            n.realNumber(43,45);
        } catch(NumberFormatException e){
            System.out.println("Please enter only numbers");
        }

    }
}
