package com.second;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Dog dog = new Dog("efe", Breeds.AFFENPINSCHER, 3);
		Dog dog2 = new Dog("efe", Breeds.AMERICAN_FOXHOUND, 2);
		Dog dog3 = new Dog("dsfg", Breeds.BULL_TERRIER, 5);

		ArrayList<Dog> dogs = new ArrayList<>();

		dogs.add(dog);
		dogs.add(dog2);
		dogs.add(dog3);

		isSameNames(dogs);
		oldestDog(dogs);

	}

	// public static void isSameNames(ArrayList<Dog> arr){
	// Dog tmpDog = arr.get(0);
	// for (Dog dog : arr) {
	// tmpDog = dog;
	//
	// }
	// }
	public static void isSameNames(ArrayList<Dog> arr) {
		for (int i = 0; i < arr.size(); i++) {

			for (int j = i + 1; j < arr.size(); j++) {

				if (arr.get(i).getName().equals(arr.get(j).getName())) {
					System.out.println("There are dogs with same names, they are " + arr.get(i) + " and " + arr.get(j));
				}

			}

		}
		System.out.println();
	}

	public static void oldestDog(ArrayList<Dog> arr) {

		Dog tmpDog = arr.get(0);

		for (Dog dog : arr) {
			if (tmpDog.getAge() > dog.getAge())
				;
			tmpDog = dog;
		}

		System.out.println("Oldest dog is " + tmpDog.getName() + " " + tmpDog.getBreed());
	}

}
