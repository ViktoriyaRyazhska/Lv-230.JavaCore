package less1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a: ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter b: ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("a= " + a + " b= " + b);
		System.out.println("a+b = " + (a+b));
		System.out.println("a-b = " + (a-b));
		System.out.println("a*b = " + (a*b));
		
		if (a < 0 && b < 0) {
			System.out.println("Error");
		}else {
			System.out.println("a/b = " + (a/b));

		}

	}

}
