package packHW4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1.Ask user to enter the number of month. Read the value and write the
		// amount of days in this month (create array with amount days of each
		// month).
		int[] DaysInMonth = new int[12];
		DaysInMonth[0] = 31;
		DaysInMonth[1] = 28;
		DaysInMonth[2] = 31;
		DaysInMonth[3] = 30;
		DaysInMonth[4] = 31;
		DaysInMonth[5] = 30;
		DaysInMonth[6] = 31;
		DaysInMonth[7] = 31;
		DaysInMonth[8] = 30;
		DaysInMonth[9] = 31;
		DaysInMonth[10] = 30;
		DaysInMonth[11] = 31;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the month:");
		int NumberOfMonth = Integer.parseInt(sc.nextLine());

		if (NumberOfMonth <= 12 && NumberOfMonth >= 1) {
			System.out.println("Month " + (NumberOfMonth) + " has " + DaysInMonth[NumberOfMonth - 1] + " days");
		}
		System.out.println("");

		Car[] array = new Car[4];
		array[0] = new Car("Car1", 2010, 560);
		array[1] = new Car("Car2", 2015, 420);
		array[2] = new Car("Car3", 2014, 100);
		array[3] = new Car("Car4", 2015, 423);

		System.out.println("Car 2014 - model of the year");
		int modelYear = 2014;
		for (int i = 0; i < array.length; i++) {
			if (array[i].getYear() == 2015) {
				System.out.println(array[i].getName());
			}
		}

		// 2.Enter 10 integer numbers. Calculate the sum of first 5 elements if
		// they are positive or product of last 5 element in the other case.

		int ArrNum[] = new int[10];
		int count = 0;
		int SumPos = 0;
		int SumOther = 0;

		System.out.println("Enter 10 number:");
		while (count < 10) {
			ArrNum[count] = Integer.parseInt(sc.nextLine());
			count++;
		}

		for (int i = 0; i < ArrNum.length; i++) {
			if (i < 5) {
				if (ArrNum[i] > 0) {
					SumPos += ArrNum[i];
				} else {
					i = 4;
					SumPos = 0;
				}
			} else {
				if (SumPos == 0) {
					SumOther += ArrNum[i];
				}

			}
		}
		System.out.println(
				SumPos != 0 ? "Calculation sum of first 5 elements:" + SumPos : "Calculation other case:" + SumOther);

		// 3. Enter 5 integer numbers. Find position of second positive number;
		// minimum and its position in the array.
		int countPosNumber = 0;
		int posPosition = 0;
		int min;
		int minPosition = 0;
		count = 0;

		System.out.println("Enter 5 integer number:");
		while (count < 5) {
			ArrNum[count] = Integer.parseInt(sc.nextLine());
			count++;
		}
		min = ArrNum[0];
		for (int i = 0; i < ArrNum.length; i++) {
			if (ArrNum[i] > 0) {
				countPosNumber++;
			}

			if (countPosNumber == 2) {
				posPosition = i;
			}

			if (ArrNum[i] < min) {
				min = ArrNum[i];
				minPosition = i;
			}
		}

		System.out.println("Position of second positive number: " + posPosition);
		System.out.println("Minimum: " + min);
		System.out.println("Position minimum in the array: " + minPosition);

		System.out.println("");

		// 4. Organize entering integers until the first negative number. Count
		// the product of all entered even numbers.

		int evenNumbers = 0;
		int inputValue;

		do {
			System.out.println("Enter number:");
			inputValue = Integer.parseInt(sc.nextLine());
			if ((inputValue % 2) == 0) {
				evenNumbers++;
			}

		} while (inputValue > 0);
		System.out.println("Count of all entered even numbers " + evenNumbers);
		System.out.println("");

		Car NextValue = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].getYear() > array[j].getYear()) {
					NextValue = array[i];
					array[i] = array[j];
					array[j] = NextValue;
				}
			}
		}

		System.out.println("Cars ordered by the field year.");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].getName() + " " + array[i].getYear());
		}

	}

}
