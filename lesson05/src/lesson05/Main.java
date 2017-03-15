package lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] array = {1, -22, 4, 2, -5, 0, -6, -7, 0, 0};
//Task 1		
		System.out.println("\n Task 1 \n");

		int biggest = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(biggest < array[i]){
				biggest = array[i];
			}
		}
		System.out.println(biggest);
		
// Task 2
		System.out.println("\n Task 2 \n");

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > 0){
				sum+=array[i];
			}
		}
		System.out.println(sum);
	
	
//Task 3
		System.out.println("\n Task 3 \n");

		int countNeg = 0;
		for (int i : array) {
			if(i < 0){
				countNeg++;
			}
		}
		System.out.println(countNeg);
		
// Task4
		System.out.println("\n Task 4 \n");
		int positive = 0;
		for (int i : array) {
			if(i > 0){
				positive++;
			}
		}
		if(positive > countNeg){
		System.out.println("positive numbers are more");
		}else{
			System.out.println("negative ");
		}
		
// Task 5
		System.out.println("\n Task 5 \n");
		Employee [] ems = new Employee[5];
		ems[0] = new Employee("Ivan", 1, 3400);
		ems[1] = new Employee("Vasja", 1, 5000);
		ems[2] = new Employee("Kostya", 2, 45);
		ems[3] = new Employee("Nastya", 2, 3600.8);
		ems[4] = new Employee("Pavel", 3, 9999.99);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter dep number");
		int depNum = Integer.parseInt(br.readLine());
		for (Employee employee : ems) {
			if(employee.getDepartmentNumber() == depNum){
				System.out.println(employee);
			}
		}
// Task 6
		System.out.println("\n Task 6 \n");
		Employee tempEm;
		
		for (int i = 0; i < ems.length-1; i++) {
			for (int j = i+1; j < ems.length; j++) {
				if(ems[i].getSalary() <	ems[j].getSalary()){
					tempEm = ems[i];
					ems[i] = ems[j];
					ems[j] = tempEm;
				}
			}
		}
		for (Employee employee : ems) {
			System.out.println(employee);
		}
		
	}	
}
