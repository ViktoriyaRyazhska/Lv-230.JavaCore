import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersBelong {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Boolean bool = false;
	double number = 0;
	System.out.println("Enter your firs number");
	number = Double.parseDouble(br.readLine());
	
	
if(number <= 5 && number >= -5){
	System.out.println("The number is belong to the range [-5;5]");
}
else{
	System.out.println("Your number is not beetwen -5 and 5");
}
	


	System.out.println("Enter second number");
	number = Double.parseDouble(br.readLine());

	if(number <= 5 && number >= -5){
		System.out.println("The number is belong to the range [-5;5]");
	}
	else{
		System.out.println("Your number is not beetwen -5 and 5");
	}
	
	System.out.println("Enter third number");
	number = Double.parseDouble(br.readLine());

	if(number <= 5 && number >= -5){
		System.out.println("The number is belong to the range [-5;5]");
	}
	else{
		System.out.println("Your number is not beetwen -5 and 5");
	}
	

	





	}
}


