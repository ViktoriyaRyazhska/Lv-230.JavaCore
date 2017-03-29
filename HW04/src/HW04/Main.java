package HW04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String [] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

// Task 1
			System.out.println("Enter 1 float num");
			float num1 = 0;
			try {
				num1 = Float.parseFloat(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.err.println(e.getMessage());
			}
			System.out.println("Enter 2 float num");
			float num2 = 0;
			try {
				num2 = Float.parseFloat(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.err.println(e.getMessage());
			}
			System.out.println("Enter 3 float num");
			float num3 = 0;
			try {
				num3 = Float.parseFloat(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.err.println(e.getMessage());

			}
			if (isCont(num1) && isCont(num2) && isCont(num3)){
				System.out.println("All numbers are in range!!!");
			}else{
				System.out.println("Not all are in range");
			}
			
	// Task 2
			System.out.println("Enter 1 int num");
			int int1 = 0;
			try {
				int1 = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.err.println(e.getMessage());
			}
			System.out.println("Enter 2 int num");
			int int2 = 0;
			try {
				int2 = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.err.println(e.getMessage());
			}
			System.out.println("Enter 3 int num");
			int int3 = 0;
			try {
				int3 = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.err.println(e.getMessage());
			}
			System.out.println("Max value is: "+findBigest(findBigest(int1, int2), int3));
			System.out.println("Min value is: "+findLessNumber(findLessNumber(int1, int2), int3));
			
	//Task 3
			System.out.println("Enter number of HTTP error");
			int error = 0;
			try {
				error = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.err.println(e.getMessage());

			}
			
			switch (error) {
			case 400:{
				System.out.println(HTTPErrors.BAD_REQUEST);
				break;
			}
			case 401:{
				System.out.println(HTTPErrors.UNAUTHORIZED);
				break;
			}
			case 402:{
				System.out.println(HTTPErrors.PAYMENT_REQUIRED);
				break;
			}
			case 403:{
				System.out.println(HTTPErrors.FORBIDDEN);
				break;
			}
			case 404:{
				System.out.println(HTTPErrors.NOT_FOUND);
				break;
			}
			case 405:{
				System.out.println(HTTPErrors.METHOD_NOT_ALLOWED);
				break;
			}
			case 406:{
				System.out.println(HTTPErrors.NOT_ACCEPTABLE);
				break;
			}
			case 407:{
				System.out.println(HTTPErrors.PROXY_AUTHENTICATION_REQUIRED);
				break;
			}
			case 408:{
				System.out.println(HTTPErrors.REQUEST_TIMEOUT);
				break;
			}
			case 409:{
				System.out.println(HTTPErrors.CONFLICT);
				break;
			}
			case 410:{
				System.out.println(HTTPErrors.GONE);
				break;
			}
			case 411:{
				System.out.println(HTTPErrors.LENGTH_REQUIRED);
				break;
			}
			case 412:{
				System.out.println(HTTPErrors.PRECONDITION_FAILED);
				break;
			}
			default:
			{
				System.out.println("Wrong input!!!");
				}
			}

// Task 4 
		
		Dog dog1 = new Dog("Sharik", Breed.BOXER, 2);
		Dog dog2 = new Dog("Mikey", Breed.BULLDOG, 5);
		Dog dog3 = new Dog("Sharik", Breed.ALABAY, 3);
		compareNames(dog1, dog2);
		compareNames(dog2, dog3);
		compareNames(dog1, dog3);
		
		Dog dog4 = compareAge(compareAge(dog2, dog2), dog3);
		System.out.println(dog4);
		
		try {
			br.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static Dog compareAge(Dog dog1, Dog dog2) {
		if(dog1.getAge() >= dog2.getAge()){
			return dog1;
		}else{
			return dog2;
		}
	}

	public static void compareNames(Dog dog1, Dog dog2) {
		if(dog1.getName().equals(dog2.getName())){
			System.out.println("There are dogs with same name: \n"+dog1+"\n"+dog2);
		}else{
			System.out.println("Names are different");
		}
		
	}

	public static boolean isCont(float num){
		return num >= -5 && num <= 5;
	}
	
	public static int findBigest(int num1, int num2){
		if(num1 >= num2){
			return num1;
		}else{
			return num2;
		}
	}
	
	public static int findLessNumber(int int1, int int2){
		if(int1 <= int2){
			return int1;
		}else{
			return int2;
		}
	}

}
