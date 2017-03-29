import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DividingNumbers {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		
		
		DividingNumbers result = new DividingNumbers();
		
		System.out.println("Enter your numbers");
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			a = Double.parseDouble(br.readLine());
			b = Double.parseDouble(br.readLine());
			System.out.println("Your result is " + result.div(a, b)   );
		}
		
		catch(IOException | NumberFormatException | ArithmeticException | ZeroNumberException e ){
			System.out.println(e);
		}
		
	}

	public double div(double a, double b) throws ZeroNumberException{
		if(a != 0.0 && b != 0.0){
			return a/b;
		}
		else{
			throw new ZeroNumberException();
		}
	
	}
	
}
