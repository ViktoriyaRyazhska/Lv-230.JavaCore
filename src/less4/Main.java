package less4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// Task1
		// System.out.println("Enter three numbers: ");
		// System.out.println("1 number: ");
		// int num1 = Integer.parseInt(bf.readLine());
		// System.out.println("2 number: ");
		// int num2 = Integer.parseInt(bf.readLine());
		// System.out.println("3 number: ");
		// int num3 = Integer.parseInt(bf.readLine());
		// int count = 0;
		// if (num1 % 2 == 0) {
		// count++;
		//
		// }
		// if (num2 % 2 == 0) {
		// count++;
		// }
		// if (num3 % 2 == 0) {
		// count++;
		//
		// }
		// System.out.println("even numbers: " + count);

		// Task2
		boolean isRun = true;
		// while (isRun) {
		// System.out.println("Enter the number of the day of the week: ");
		//
		// switch (Integer.parseInt(bf.readLine())) {
		// case 1: {
		// System.out.println("Monday, Понеділок, Понедельник");
		// break;
		// }
		// case 2: {
		// System.out.println("Tuesday, Вівторок, Вторник");
		// break;
		// }
		// case 3: {
		// System.out.println("Wednesday, Середа, Среда");
		// break;
		// }
		// case 4: {
		// System.out.println("Thursday, Четвер, Четверг");
		// break;
		// }
		// case 5: {
		// System.out.println("Friday, Пятниця, Пятница");
		// break;
		// }
		// case 6: {
		// System.out.println("Saturday, Субота, Суббота");
		// break;
		// }
		// case 7: {
		// System.out.println("Sunday, Неділя, Воскресенье");
		// break;
		// }
		// default: {
		// isRun = false;
		// }
		// }
		// }

		// TASK3
		// while (isRun) {
		// System.out.println("Enter country: ");
		// switch (bf.readLine().toLowerCase()) {
		// case "ukraine": {
		// System.out.println(Continents.EUROPE);
		// break;
		// }
		// case "rusia": {
		// System.out.println(Continents.ASIA);
		// break;
		// }
		// case "france": {
		// System.out.println(Continents.EUROPE);
		// break;
		// }
		// }
		// }

		// TASK4
		Product product1 = new Product("Nokia", 123.2, 11);
		Product product2 = new Product("Sony", 139.2, 18);
		Product product3 = new Product("Alcatel", 167.2, 6);
		comparePrice(product1, product2, product3);
		compareQuantity(product1, product2, product3);

	}

	private static void comparePrice(Product product, Product product2, Product product3) {
		if ((product.getPrice() > product2.getPrice()) && (product.getPrice() > product3.getPrice())) {
			System.out.println("Most expensive item: " + product.getName() + ", Price: " + product.getPrice());
		} else if ((product2.getPrice() > product.getPrice()) && (product2.getPrice() > product3.getPrice())) {
			System.out.println("Most expensive item: " + product2.getName() + ", Price: " + product2.getPrice());

		} else {
			System.out.println("Most expensive item: " + product3.getName() + ", Price: " + product3.getPrice());

		}

	}

	private static void compareQuantity(Product product, Product product2, Product product3) {
		if ((product.getQuantity() > product2.getQuantity()) && (product.getQuantity() > product3.getQuantity())) {
			System.out.println("Biggest quantity: " + product.getName());
		} else if ((product2.getQuantity() > product.getQuantity())
				&& (product2.getQuantity() > product3.getQuantity())) {
			System.out.println("Biggest quantity: " + product2.getName());

		} else {
			System.out.println("Biggest quantity: " + product3.getName());

		}

	}

}
