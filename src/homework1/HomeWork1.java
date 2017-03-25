package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class HomeWork1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(Locale.getDefault(Locale.Category.FORMAT));

//1) Flower bed is shaped like a circle. Calculate the perimeter and
//area by entering the radius. Output obtained results

		System.out.println("What is the radius of the flower bed?");
		double flowerBedRadius = Double.parseDouble(br.readLine());

		System.out.println("The perimeter of the flower bed is " + (2 * Math.PI * flowerBedRadius));
		System.out.println("The area of the flower bed is " + (Math.PI * Math.pow(flowerBedRadius, 2)));

		
//2) Define string variable name and integer value age. Output question
//"What is your name?" Read the value name and output next question:
//“Where are you live, (name)?". Read address and write whole
//information
		 
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where do you live, " + name + "?");
		String address = br.readLine();
		System.out.println("How old are your?");
		int age = Integer.parseInt(br.readLine());

		System.out.println(name + ", You are " + age + "years old, and You live in " + address);

		
//3) Phone calls from three different countries are ñ1, ñ2 and ñ3
//standard units per minute. Talks continued t1, t2 and t3 minutes. How
//much computer will count for each call separately and all talk
//together? Input all source data from console, make calculations and
//output to the screen

		System.out.println("What is the tariff for calls from contry 1?");
		double tariff1 = Double.parseDouble(br.readLine());
		System.out.println("What is the tariff for calls from contry 2?");
		double tariff2 = Double.parseDouble(br.readLine());
		System.out.println("What is the tariff for calls from contry 3?");
		double tariff3 = Double.parseDouble(br.readLine());

		System.out.println("What is the duration of the call from contry 1?");
		int time1 = Integer.parseInt(br.readLine());
		System.out.println("What is the duration of the call from contry 2?");
		int time2 = Integer.parseInt(br.readLine());
		System.out.println("What is the duration of the call from contry 3?");
		int time3 = Integer.parseInt(br.readLine());

		double tax1 = tariff1 * time1;
		double tax2 = tariff2 * time2;
		double tax3 = tariff3 * time3;

		System.out.println("The tax for call talk with contry 1 is " + (tax1));
		System.out.println("The tax for call talk with contry 2 is " + (tax2));
		System.out.println("The tax for call talk with contry 3 is " + (tax3));
		System.out.println("Total tax for all calls is " + (tax1 + tax2 + tax3));
	}

}