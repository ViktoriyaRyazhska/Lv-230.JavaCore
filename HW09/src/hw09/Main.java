package hw09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
// Task 1
		try {
			
			System.out.println(div(2, 0));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
//Task 2
		System.out.println("Enter number to check");
		try {
			System.out.println(readNumber(-5, 5));
		} catch (NumberFormatException | IOException | ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}

	private static double div(double a, double b)throws ArithmeticException{
		if (b == 0){
			throw new ArithmeticException("div by zero!!! \n");
		}
			return a/b;
		
	}
	
	private static int readNumber(int start, int end) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
			if(!(num < end && num > start)){
				throw new ArithmeticException("Not in range");
			}
				return num;
			
		
	}
}
