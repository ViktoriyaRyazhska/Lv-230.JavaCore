import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea {

	public static void main (String[] args) {
		
		RectangleArea area = new RectangleArea();
		
		int a = 0;
		int b = 0;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			System.out.println("Your area is " + area.squareRectangle(a, b)  );
		}
		catch(IOException | NumberFormatException | NegativeNumberExceptions e ){
			System.out.println(e + " You write a negative number or a zero>please try again");
		}
		
		}
	public int squareRectangle(int a, int b) throws NegativeNumberExceptions {
        if ((a >= 0) && (b >= 0)) {
            return a * b;
        } else {
            throw new NegativeNumberExceptions();
        }
    }


}
