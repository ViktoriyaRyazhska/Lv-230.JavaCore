import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {

	public static void main(String[] args) {
		
		Number result = new Number();
		
		int start = 1;
		int end = 100;
		int number = 0;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter your number please");
			number = Integer.parseInt(br.readLine());
			System.out.println("Your result is " + result.readNumber(start, end, number));
		}
		catch(IOException | NumberFormatException  | MyException e){
			System.out.println(e.getMessage());
			
		}
		
	}

	public int readNumber(int start, int end, int number) throws MyException{
		if(number>start && number>end){
			return number;
		}
		else{
			throw new MyException();
		}
		
		
	}
	
	
	
}
