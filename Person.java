package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kitty on 3/10/17.
 */
public class Person {
    private String name;
    private Integer birthYear;

    public String getName(){return name;
    }
    public Integer getbirthYear(){return birthYear;
    }
    public Person(){}
    public Person(String name, Integer birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public Integer age(Integer dateNow){
        return dateNow - this.birthYear;
    }

    public static Person input() throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name: ");
        String name = br.readLine();

        System.out.println("Enter birth year: ");
        Integer birth = Integer.parseInt(br.readLine());

        return new Person(name, birth);
    }

    @Override
public String toString(){
        return "Name " + this.name + "Birth Date " + this.birthYear;
    }

    public void changeName (String name){
        this.name = name;
    }
}
