package hom4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// Task 1
		// System.out.println("Enter number of month: ");
		// DayOfMonth dayOfMonth = new DayOfMonth();
		// dayOfMonth.dayInMonth(Integer.parseInt(bf.readLine()));
		// bf.close();

		// SumOfNumber sn = new SumOfNumber();
		// System.out.println("Enter 10 number: ");
		// int[] array = new int[10];
		// sn.CalculateSumOfFirstElements(array);
		FindPosition findPosition = new FindPosition();
		int[] array1 = { 0, 0, 0, 0, 1, 0, 0, 0 };
		System.out.println(findPosition.PositionOfSecondnPositiveNumber(array1));
		// findPosition.minimum(array1);
		// System.out.println("Enter numbers: ");
		// System.out.println(findPosition.enteringIntegersUntilFirstNegative(bf));
		// Car car = new Car();
		// Car[] cars = new Car[4];
		// cars[0] = new Car("Bus", 2009, 100);
		// cars[1] = new Car("Sport", 2001, 250);
		// cars[2] = new Car("Bus", 2001, 90);
		// cars[3] = new Car("Pikap", 2017, 150);
		// System.out.println("Enter year: ");
		// int numbCars = Integer.parseInt(bf.readLine());
		//// car.findByYear(cars, numbCars);
		// car.orderedByYear(cars);
	}
}
