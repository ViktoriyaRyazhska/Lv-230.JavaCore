package dz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//Task 1 Circle
		System.out.println("Enter radius");
		double r = Double.parseDouble(br.readLine());
		System.out.println("Area of circle is: " + (Math.PI * Math.pow(r, 2)));

		System.out.println("Diameter is: " + (r * 2));
//Task 2 Info about person
		
		System.out.println("What is your name");
		String name = br.readLine();
		System.out.println("How old are you " + name + " ?");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Hello " + name + " where are you live?");
		String adress = br.readLine();
		System.out.println("Name: " + name + " Age: "+age+" Adress: " + adress);
//Task 3 Phone calls
		System.out.println("Enter price 1 country calls");
		double c1 = Double.parseDouble(br.readLine());
		
		System.out.println("Enter price 2 country calls");
		double c2 = Double.parseDouble(br.readLine());
		
		System.out.println("Enter price 3 country calls");
		double c3 = Double.parseDouble(br.readLine());
		
		System.out.println("Enter time of 1 call");
		double t1 = Double.parseDouble(br.readLine());
		
		System.out.println("Enter time of 2 call");
		double t2 = Double.parseDouble(br.readLine());
		
		System.out.println("Enter time of 3 call");
		double t3 = Double.parseDouble(br.readLine());

		double sep1 = c1*t1;
		double sep2 = c2*t2;
		double sep3 = c3*t3;
		
		System.out.println("Call from 1 country costs: "+sep1);
		System.out.println("Call from 2 country costs: "+sep2);
		System.out.println("Call from 3 country costs: "+sep3);
		
		System.out.println("Total time is: "+(t1+t2+t3)+" total cost is: "+(sep1+sep2+sep3));

	}

}
