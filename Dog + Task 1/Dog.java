package com.home;

/**
 * Created by kitty on 3/19/17.
 */
public class Dog {
    public String name;
    public Integer age;

    public enum Breed {DOG, PITBULL, KOLLY, DOBERMAN}

    Breed breed;

    public Dog(String name, Breed breed, Integer age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    String getName(){
        return name;
    }
    Integer getAge(){
        return age;
    }
    Breed getBreed() {return breed;}

}
