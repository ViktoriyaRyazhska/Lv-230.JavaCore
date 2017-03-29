package Package;

import java.util.Scanner;
import org.omg.Messaging.SyncScopeHelper;

import Package.Solution.HTTPErrors;

public class Main {

	public static void main(String[] args) {

		double number1;
		double number2;
		double number3;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 number:");
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		number3 = input.nextDouble();

		Solution InstanceOfSolution = new Solution();

		// 1.a read 3 float numbers and check: are they all belong to the range
		// [-5,5];
		boolean numberInRange1 = InstanceOfSolution.Solution1a(number1, number2, number3);

		if (numberInRange1 == true) {
			System.out.println("Above 3 numbers are all belong to the range [-5,5]");
		} else {
			System.out.println("Above 3 numbers are not all belong to the range [-5,5]");
		}

		System.out.println("");

		// 1.b read 3 integer numbers and write max and min of them;
		int num1;
		int num2;
		int num3;

		System.out.println("Enter 3 number:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		System.out.println("max= " + InstanceOfSolution.Solution1bmax(num1, num2, num3));
		System.out.println("min= " + InstanceOfSolution.Solution1bmin(num1, num2, num3));

		/*
		 * 1.c read number of HTTP Error (400, 401,402, ...) and write the name
		 * of this error (Declare enum HTTPError)
		 */
		System.out.println("Input number of HTTPError:");
		int mistake = input.nextInt();
		System.out.println(InstanceOfSolution.NumberOFError(mistake));

		// 3.
		Dog dog1 = new Dog("Dog1", 5, ItemsBreed.BordeauxDog);
		Dog dog2 = new Dog("Dog2", 2, ItemsBreed.EnglishBulldog);
		Dog dog3 = new Dog("Dog3", 3, ItemsBreed.Dachshund);
		
		//Check if there is no two dogs with the same name. 
		boolean ChecksTheSameName = InstanceOfSolution.ChecksName(dog1.getName(), dog2.getName(), dog3.getName());
		System.out.println((ChecksTheSameName==true?"there is two ":" there is no two ")+"dog with the same name");
		
		 //	Display the name and the kind of the oldest dog.
		int oldest = InstanceOfSolution.Solution1bmax(dog1.getAge(), dog2.getAge(), dog3.getAge());
		if (dog1.getAge()==oldest) {
			System.out.println(dog1.toString());
		} else if (dog2.getAge()==oldest) {
			System.out.println(dog2.toString());
		} else 
			System.out.println(dog3.toString());		}
	
}
