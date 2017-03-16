package hw05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// Task 1
		
		int month_days[ ]  = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31};
		System.out.println("Enter number of month");
		int monthNumber = Integer.parseInt(br.readLine());
		try{
		System.out.println("This month has "+month_days[monthNumber-1]+"days");
		}catch (Exception e) {
			System.out.println("No such month");
		}
// Task 2		
		System.out.println("\n Task 2 \n");
		int sum = 0;
		int [] array = new int[10];
		System.out.println("Enter 10 integer numbers");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < 5; i++) {
			if(array[i] > 0){
				sum += array[i];
			}else{
				sum = 0;
				break;
			}
		}
		if(sum != 0){
			System.out.println("Sum of first 5 numbers is "+sum);
		}else{
			int prod = 1;
			for (int i = 5; i < array.length; i++) {
				prod *= array[i];
			}
			System.out.println("In first 5 numbers was negative number!!!");
			System.out.println("Product of last 5 numbers is "+prod);
		}
			
//Task 3
		System.out.println("\n Task 3(a)\n");
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[5];
		int position = 0;
		int count = 0;
		System.out.println("Enter 5 integer numbers");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i] > 0){
				count++;
				if(count == 2){
				position = i+1;
				break;
				}
			}
		}
		if(position != 0){
			System.out.println(position);
		}else{
			System.out.println("No second positive number");
		}
// Task 3
		System.out.println("\n Task 3(b)\n");
		int min = intArray[0];
		int pos = 0;
		for (int i = 1; i < intArray.length; i++) {
			if(intArray[i] < intArray[i-1]){
				min = intArray[i];
				pos = i+1;
			}
		}
		System.out.println("min: "+min+"\n position: "+pos);

		
//Task 4
		System.out.println("\n Task 4 \n");
		System.out.println("Enter integer numbers");
		boolean run = true;
		int product = 1;
		int countNum = 0;
		while(run){
			int num = Integer.parseInt(br.readLine());
			countNum++;
			System.out.println("count: "+countNum+" number: "+num);
			if(num <= 0){
				run = false;
			}else{
				if(num % 2 == 0){
					product *= num;
				}
			}
		}
		System.out.println("Product of all even numbers is: "+product);
		
// Task 5
		System.out.println("\n Task 5 \n");
		Car [] cars = new Car[4];
		cars[0] = new Car(TypeOfCar.HATCHBACK, 2003, 1.8);
		cars[1] = new Car(TypeOfCar.JEEP, 2012, 3.0);
		cars[2] = new Car(TypeOfCar.SEDAN, 1996, 2.2);
		cars[3] = new Car(TypeOfCar.CABRI, 2000, 1.6);
		System.out.println("Enter a car`s year of production");
		int year = Integer.parseInt(br.readLine());
		for (Car car : cars) {
			if(car.getYear() == year){
				System.out.println(car);
			}
		}
		System.out.println();
		Car tempCar;
		for (int i = 0; i < cars.length-1; i++) {
			for (int j = i+1; j < cars.length; j++) {
				if(cars[i].getYear() > cars[j].getYear()){
					tempCar = cars[i];
					cars[i] = cars[j];
					cars[j] = tempCar;
				}
			}
		}
		System.out.println("Cars sorted enscending by year");
		for (Car car : cars) {
			System.out.println(car);
		}
		sc.close();
		br.close();
	}
	
}
