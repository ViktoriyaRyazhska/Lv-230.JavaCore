package com.homework;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        //Person p1 = Person.input();

        //System.out.println(p1);

        Person p1 = new Person();
        Person p2 = new Person("Vasya", 1980);
        Person p3 = new Person("Olena", 1990);
        Person p4 = new Person("Tetiana", 1987);
        Person p5 = new Person();


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
