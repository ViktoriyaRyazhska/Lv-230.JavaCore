package less5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int[] array = new int[10];
		// maxNumberArray(array);
		// sumOfPositiveNumbers(array);
		amountOfNegativeNumbers(array);

		Employee[] employees = new Employee[5];
		employees[0] = new Employee(2, "Nazar", 1200);
		employees[1] = new Employee(2, "Vasya", 1223);
		employees[2] = new Employee(3, "Petro", 1900);
		employees[3] = new Employee(1, "Petro", 1600);
		employees[4] = new Employee(4, "Petro", 1400);
		// System.out.println("Enter number departmen: ");
		// employeesOfCertainDepartmen(employees,
		// Integer.parseInt(bf.readLine()));
		// arrangeWorkersBySalaryInDescendingOrder(employees);

	}

	static void arrangeWorkersBySalaryInDescendingOrder(Employee[] employees) {
		Employee tmp;
		for (int i = 0; i < employees.length; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].getSalary() < employees[j].getSalary()) {
					tmp = employees[j];
					employees[j] = employees[i];
					employees[i] = tmp;
				}
			}
		}
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

	}

	static void employeesOfCertainDepartmen(Employee[] employees, int numb) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getDepartmen_number() == numb) {
				System.out.println("Employees with certain departmen: " + employees[i]);
			}
		}
	}

	static void amountOfNegativeNumbers(int[] array) {
		int negative = 0;
		int positive = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20) - 10;
			System.out.print(array[i] + " ");
			if (array[i] < 0) {
				negative++;
			} else {
				positive++;
			}
		}
		System.out.println();
		System.out.println("Amount of negative numbers = " + negative);
		if (negative == positive) {
			System.out.println("Negative and positive numbers is equally");
		} else if (negative < positive) {
			System.out.println("More positive values = " + positive);

		} else {
			System.out.println("More negative values = " + negative);
		}

	}

	static void sumOfPositiveNumbers(int[] array) {
		int number = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 2);
			System.out.print(array[i] + " ");
			if (array[i] > 0) {
				number += array[i];
			}
		}
		System.out.println();
		System.out.println("Sum of positive numbers = " + number);

	}

	static void maxNumberArray(int[] array) {
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 12) + 1;
			System.out.print(array[i] + " ");
			if (array[i] > max) {
				max = array[i];
			}

		}
		System.out.println();
		System.out.println("Max = " + max);
	}

}
