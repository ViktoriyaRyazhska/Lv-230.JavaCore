package hom3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// tASK1(A)

		// System.out.println("Enter number 1: ");
		// float num1 = Float.parseFloat(bf.readLine());
		// System.out.println("Enter number 2: ");
		// float num2 = Float.parseFloat(bf.readLine());
		// System.out.println("Enter number 3: ");
		// float num3 = Float.parseFloat(bf.readLine());
		//
		// if(checkRange(num1)&&checkRange(num2)&&checkRange(num3)){
		// System.out.println("All numbers in the range [-5;5]: ");
		// }else {
		// System.out.println("Not all numbers in the range: ");
		// }

		// Task1(B)

		// System.out.println("Enter number 1: ");
		// int num1 = Integer.parseInt(bf.readLine());
		// System.out.println("Enter number 2: ");
		// int num2 = Integer.parseInt(bf.readLine());
		// System.out.println("Enter number 3 : ");
		// int num3 = Integer.parseInt(bf.readLine());
		// System.out.println("Max numb: " + maxNumber(maxNumber(num1, num2),
		// num3));
		// System.out.println("Min numb: " + minNumber(minNumber(num1, num2),
		// num3));

		// TASK1(C)

		// boolean isRun = true;
		// while (isRun) {
		// System.out.println("Enter number of HTTP Error(400-405): ");
		// System.out.println("Enter 0 to exit.");
		// switch (bf.readLine()) {
		// case "400": {
		// System.out.println(HTTPError.BAD_REQUEST);
		// break;
		// }
		// case "401": {
		// System.out.println(HTTPError.UNAUTHORIZED);
		// break;
		// }
		// case "402": {
		// System.out.println(HTTPError.PAYMNET_REQUIRED);
		// break;
		// }
		// case "403": {
		// System.out.println(HTTPError.FORBIDDEN);
		// break;
		// }
		// case "404": {
		// System.out.println(HTTPError.NOT_FOUND);
		// break;
		// }
		// case "405": {
		// System.out.println(HTTPError.METHOD_NOT_ALLOWED);
		// break;
		// }
		// default: {
		// isRun = false;
		// break;
		// }
		// }
		//
		// }

		// TASK2

		Dog dog1 = new Dog("Bobik", Breed.BULLDOG, 2);
		Dog dog2 = new Dog("Lord", Breed.GERMAN_SHEPHERD, 1);
		Dog dog3 = new Dog("Lord", Breed.GOLDEN_RETRIEVER, 3);

		System.out.println("Chek on same dogs name: " + dog1.compareName(dog2, dog2));
		dog1.compareAge(dog1, dog2);
	}

	private static boolean checkRange(float num) {
		if (num >= -5 && num <= 5) {
			return true;
		} else {
			return false;
		}
	}

	private static int maxNumber(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}

		return num2;

	}

	private static int minNumber(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		}

		return num2;

	}

}
