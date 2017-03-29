package homework4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork4Main {

//	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);

		Scanner userInput = new Scanner(System.in);

// 1) Ask user to enter the number of month. Read the value and write
// the amount of days in this month
// (create array with amount days of each month).

		int[] numberOfDaysInEachMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("Please enter the number of the month (1..12) to check the amount of days in it:");
		int monthNumber = userInput.nextInt();

		while (monthNumber < 1 || monthNumber > 12) {
			System.out.println("The number of the month You entered is not within the range from 1 to 12.");
			System.out.println("Please enter the number of the month (1..12) to check the amount of days in it:");
			monthNumber = userInput.nextInt();
		}

		System.out.println("Month N " + monthNumber + " has " + numberOfDaysInEachMonth[monthNumber - 1] + " days.");
		System.out.println();

// 2) Enter 10 integer numbers. Calculate the sum of first 5 elements if
// they are positive
// or product of last 5 element in the other case.

		int positiveCount = 0;

		int[] arrayOf10IntegerNumbers = new int[10];
		int sumOfFirstFiveEl = 0;
		int prodOfLastFiveEl = 1;

		System.out.println("Please enter 10 integer numbers:");
		for (int i = 0; i < arrayOf10IntegerNumbers.length; i++) {
			arrayOf10IntegerNumbers[i] = userInput.nextInt();
		}

		System.out.println("Entered array is: " + Arrays.toString(arrayOf10IntegerNumbers));

		for (int i = 0; i < 5; i++) {
			if (arrayOf10IntegerNumbers[i] > 0) {
				positiveCount++;
			}
		}
		if (positiveCount == 5) {
			for (int i = 0; i < 5; i++) {
				sumOfFirstFiveEl = sumOfFirstFiveEl + arrayOf10IntegerNumbers[i];
			}
			System.out.println("The sum of the first 5 elements is " + sumOfFirstFiveEl);
		} else {
			for (int i = 5; i < arrayOf10IntegerNumbers.length; i++) {
				prodOfLastFiveEl = prodOfLastFiveEl * arrayOf10IntegerNumbers[i];
			}
			System.out.println("The product of the last 5 elements is " + prodOfLastFiveEl);
		}
		System.out.println();

// 3) Enter 5 integer numbers. Find position of second positive number;
// minimum and its position in the array.

		int[] arrayOf5IntegerNumbers = new int[5];
		positiveCount = 0;

		System.out.println("Please enter 5 integer numbers:");
		for (int i = 0; i < arrayOf5IntegerNumbers.length; i++) {
			arrayOf5IntegerNumbers[i] = userInput.nextInt();
		}

		System.out.println("Entered array is: " + Arrays.toString(arrayOf5IntegerNumbers));
		
		int minOfArray = arrayOf5IntegerNumbers[0];
		int iMin = 0;

		for (int i = 0; i < arrayOf5IntegerNumbers.length; i++) {
			if (arrayOf5IntegerNumbers[i] < minOfArray) {
				minOfArray = arrayOf5IntegerNumbers[i];
				iMin = i;
			}
			if (arrayOf5IntegerNumbers[i] > 0) {
				positiveCount++;
			}
			if (positiveCount == 2) {
				System.out.println("The position of second positive number is: " + (i + 1));
				positiveCount++;
			}
		}
		if (positiveCount < 2) {
			System.out.println("There are less than two positive numbers within entered array.");
		}
		System.out.println(
				"Minimum within entered array  is " + minOfArray + " and it is on the " + (iMin + 1) + "place.");
		System.out.println();

// 4) Organize entering integers until the first negative number. Count
// the product of all entered even numbers.

		int input = 0;
		int prodOfEvenNumbers = 1;
		
		do {
			System.out.println("Please enter integer numbers:");
			input = userInput.nextInt();
			if (input < 0) {
				System.out.println("You've entered negative number:");
				break;
			} else {
				if (input % 2 == 0) {
					prodOfEvenNumbers = prodOfEvenNumbers*input;
				}
			}
		} while (input >= 0);

		if (prodOfEvenNumbers > 1) {
			System.out.println("The product of all entered even numbers is :" + prodOfEvenNumbers);
		} else {
			System.out.println("You have not entered at least 1 positive even number.");
		}
		System.out.println();

// 5) Create class Car with fields type, year of production and engine capacity.
// Create and initialize four instances of class Car. Display cars:
// -certain model year (enter year in the console);
// -ordered by the field year.

		Car[] carList = new Car[4];
		
		
		carList[0] = new Car("Audi Q7", 2015, 2.995);
		carList[1] = new Car("Aston Martin DB11", 2016, 5.2);
		carList[2] = new Car("Maserati GranTurismo Sport", 2012, 4.691);
		carList[3] = new Car("Porsche 911 Turbo", 2016, 3.8);

		System.out.println("Full list of available cars:");
		for(Car i : carList) {
			System.out.println(i);
		}
		
		System.out.println("Please enter production year for search:");
		int year = userInput.nextInt();

		System.out.println("Cars produced in " + year + " are:");
		Car.outputByYearOfProd(year, carList);

		System.out.println("List of Cars sorted from newest to oldest:");
		Car.sortByYearOfProd(carList);

		userInput.close();
	}

}
