package com.home;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.omg.CORBA.DynAnyPackage.InvalidValue;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidParameterException{

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter initial capacity of the storage(less then 50) ");
        Integer t3 = Integer.parseInt(input.nextLine());
        if(t3>50 || t3<0){
            throw new InvalidParameterException("Error Maximum capacity of the storage is 50");
        }


        System.out.println("Please enter speed of producing in seconds ");
        Integer t1 = Integer.parseInt(input.nextLine());


        System.out.println("Please enter speed of consuming in seconds ");
        Integer t2 = Integer.parseInt(input.nextLine());


        Storage storage1 = new Storage(t3);
        Producer producer1 = new Producer("Mivina", storage1, t1);
        Retailer retailer1 = new Retailer("Silpo", storage1, t2);


        producer1.start();
        retailer1.start();
    }
}
