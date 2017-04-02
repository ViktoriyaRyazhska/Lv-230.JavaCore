import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {

	public static void main(String[] args) {
		
		Number result = new Number();
		
		
		int number = 0;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter your number please");
			number = Integer.parseInt(br.readLine());
			System.out.println("Your result is " + result.readNumber(number));
		}
		catch(IOException | NumberFormatException  | MyException e){
			System.out.println("Your number is not beetwean 1-100.Please input another number");
			
		}
		
	}

	public int readNumber(int number) throws MyException{
		int start = 1;
		int end = 100;
		if(number>start && number<end){
			return number;
		}
		else{
			throw new MyException();
		}
		
		
	}
	
	
	
}
