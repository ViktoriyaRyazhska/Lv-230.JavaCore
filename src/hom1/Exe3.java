package hom1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exe3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter standards units per minute for three different countries($): ");

		System.out.println("1 country(Ukraine): ");
		double c1 = Double.parseDouble(bf.readLine());
		if (c1 < 0) {
			System.out.println("Error");
		}
		System.out.println("2 country(USA): ");
		double c2 = Double.parseDouble(bf.readLine());
		if (c2 < 0) {
			System.out.println("Error");
		}
		System.out.println("3 country(Rus): ");
		double c3 = Double.parseDouble(bf.readLine());
		if (c3 < 0) {
			System.out.println("Error");
		}
		System.out.println("Standards units per minute");
		System.out.println("Ukraine: " + c1 + "$");
		System.out.println("USA: " + c2 + "$");
		System.out.println("Rus: " + c3 + "$");

		System.out.println("Enter the call duration(minutes): ");
		System.out.println("1 call: ");
		double t1 = Double.parseDouble(bf.readLine());
		if (t1 < 0) {
			System.out.println("Error");
		}
		System.out.println("2 call: ");
		double t2 = Double.parseDouble(bf.readLine());
		if (t2 < 0) {
			System.out.println("Error");
		}
		System.out.println("3 call: ");
		double t3 = Double.parseDouble(bf.readLine());
		if (t3 < 0) {
			System.out.println("Error");
		}
		System.out.println("Calls duration: ");
		System.out.println("1 call: " + t1 + "min");
		System.out.println("2 call: " + t2 + "min");
		System.out.println("3 call: " + t3 + "min");

		System.out.println("In Ukraine: ");
		System.out.println("Call 1 costs: " + (c1 * t1) + "$");
		System.out.println("Call 2 costs: " + (c1 * t2) + "$");
		System.out.println("Call 3 costs: " + (c1 * t3) + "$");
		double total1 = (c1 * t1) + (c1 * t2) + (c1 * t3);
		System.out.println("Total: " + total1 + "$");

		System.out.println("In USA: ");
		System.out.println("Call 1 costs: " + (c2 * t1) + "$");
		System.out.println("Call 2 costs: " + (c2 * t2) + "$");
		System.out.println("Call 3 costs: " + (c2 * t3) + "$");
		double total2 = (c2 * t1) + (c2 * t2) + (c2 * t3);
		System.out.println("Total: " + total2 + "$");

		System.out.println("In Rus: ");
		System.out.println("Call 1 costs: " + (c3 * t1) + "$");
		System.out.println("Call 2 costs: " + (c3 * t2) + "$");
		System.out.println("Call 3 costs: " + (c3 * t3) + "$");
		double total3 = (c3 * t1) + (c3 * t2) + (c3 * t3);
		System.out.println("Total: " + total3 + "$");
	}

}
