package com.fifth;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Car[] car = new Car[4];
		car[0] = new Car("BMW", 2017, 300);
		car[1] = new Car("Honda", 2010, 120);
		car[2] = new Car("Jaguar", 2015, 250);
		car[3] = new Car("Chevrolet", 1999, 100);

		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year of car, you want to find:");
		int year = s.nextInt();

		for (Car car2 : car) {
			if (car2.getYear() == year) {
				System.out.println(car2);
			}
		}
		
		System.out.println();

		Car tmpCar;
		
		for (int i = 0; i < car.length-1; i++) {
			for (int j = i+1; j < car.length; j++) {
				if(car[i].getYear()>car[j].getYear()){
					tmpCar=car[i];
					car[i]=car[j];
					car[j]=tmpCar;
				}
			}
		}
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
	}
}
