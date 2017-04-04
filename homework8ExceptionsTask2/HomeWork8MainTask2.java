package homework8ExceptionsTask2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

public class HomeWork8MainTask2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

// 2) Write a method readNumber(int start, int end), that read from
// console integer number and return it,
// if it is in the range [start...end].
// If an invalid number or non-number text is read, the method should
// throw an exception.
// Using this method write a method main(), that has to enter 10
// numbers:
// a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

		System.out.println("Task2");

		int count = 0;
		int[] enteredNumbers = new int[10];

		while (count < 10) {
			Integer inputNumber;
			try {
				inputNumber = readNumber(1, 100);
				if (inputNumber != null) {
					enteredNumbers[count] = inputNumber;
					count++;
				}
			} catch (NumberFormatException e) {
				System.out.println("Entered value is not an integer number.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Entered numbrs are: " + Arrays.toString(enteredNumbers));

	}

	public static int readNumber(int start, int end) throws NumberFormatException, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter integer number:");
		Integer number = Integer.parseInt(br.readLine());
		if (number < start || number > end) {
			throw new MyNumberIsOutOfRangeException();
		} else {
			return number;
		}
	}
}
