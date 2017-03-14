package hom1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius: ");
		double rad = Double.parseDouble(bf.readLine());
		if (rad <= 0) {
			System.out.println("Error");
		} else {
			double area = Math.PI * (rad * rad);
			System.out.println("Area: " + area);
			double per = 2 * (Math.PI * rad);
			System.out.println("Perimeter: " + per);
		}

	}

}
