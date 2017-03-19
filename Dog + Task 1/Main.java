package com.home;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog1 = new Dog("Lolly", Dog.Breed.KOLLY, 8);
        Dog dog2 = new Dog("Polly", Dog.Breed.PITBULL, 15);
        Dog dog3 = new Dog("Lolly", Dog.Breed.DOBERMAN, 13);

    if(dog1.getName().equals(dog2.getName())){System.out.println("same name");}
        else if (dog2.getName().equals(dog3.getName())){System.out.println("same name");}
            else if (dog3.getName().equals(dog1.getName())){System.out.println("same name");}
            else {System.out.println("Different names");}

        if(dog1.getAge()>dog2.getAge()){
                if (dog1.getAge()> dog3.getAge()){
                    System.out.println("Oldest dog is " + dog1.getName() + " Age is " + dog1.getAge() + " Breed is " + dog1.getBreed());}}
        else if (dog2.getAge()<dog3.getAge()){
                    System.out.println("Oldest dog is " + dog3.getName() + " Age is " + dog3.getAge() + " Breed is " + dog3.getBreed());}
            else {
                    System.out.println("Oldest dog is " + dog2.getName() + " Age is " + dog2.getAge() + " Breed is " + dog2.getBreed());
        }
    }
}
