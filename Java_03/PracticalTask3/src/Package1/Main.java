package Package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public enum Continent {
		Australia, Antarctica, Africa, Eurasia, North_America, South_America
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int count = 0;

		Main a = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. Enter three numbers. Find out how many of them are odd.
		System.out.println("Enter three numbers");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		count = count + a.CheckOdd(n1) + a.CheckOdd(n2) + a.CheckOdd(n3);
		System.out.println(count + " of them are odd");

		// 2 Enter the number of the day of the week. Display the name in three
		// languages.
		System.out.println("Enter the number of the day of the week");
		int nw = Integer.parseInt(br.readLine());
		a.VerifayNumberofWeek(nw);

		// 3. Enter the name of the country. Print the name of the continent.
		// (Declare enum with names of continents)

		System.out.println("Enter the name of the city");
		String CountryName = br.readLine(); // input.toLowerCase()
		a.CityOfContinent(CountryName.toLowerCase());

		// 4.Create class Product with fields name, price and quantity Create
		// four instances of type Product
		Product pr = new Product("Product1", 1.12, 10);
		Product pr1 = new Product("Product2", 2.12, 20);
		Product pr2 = new Product("Product3", 111.12, 30);
		Product pr3 = new Product("Product4", 23.12, 5);
		ActionOverProduct.MoreExpensive(pr, pr1, pr2, pr3);
		ActionOverProduct.BiggestQuality(pr, pr1, pr2, pr3);

	}

	public int CheckOdd(int number) { // 1.
		if (number % 2 == 0) {
			return 1;
		}
		return 0;
	}

	public void VerifayNumberofWeek(int number) { // 2.
		switch (number) {
		case 1:
			System.out.println("Понедельник, Понеділок, Monday");
			break;
		case 2:
			System.out.println("Вторник, Вівторок, Tyusday");
			break;
		case 3:
			System.out.println("Среда, Середа, Wednesday");
			break;
		case 4:
			System.out.println("Четверг, Четвер, Thurthday");
			break;
		case 5:
			System.out.println("Пятница, П'ятниця, Friday");
			break;
		case 6:
			System.out.println("Суббота, Субота, Saturday");
			break;
		case 7:
			System.out.println("Воскресенье, Неділя, Sunday");
			break;
		}
	}

	public void CityOfContinent(String city) {
		Continent cont;
		switch (city) {
		case "lviv":
		case "odessa":
		case "belarus":
			cont = Continent.Eurasia;
			System.out.println(cont);
			break;
		case "toronto":
		case "vancouver":
			cont = Continent.North_America;
			System.out.println(cont);
			break;
		case "tunisia":
		case "algeria":
			cont = Continent.Africa;
			System.out.println(cont);
			break;
		}

	}

}
