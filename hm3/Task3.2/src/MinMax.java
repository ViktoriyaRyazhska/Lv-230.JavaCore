import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number a");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter number b");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter number c");
		int c = Integer.parseInt(br.readLine());    
		
		if (a < b & a <c ) System.out.println("a is min");
        else if ( b < a & b < c) System.out.println("b is min");
        else System.out.println("c is mix");
 
        if (a > b & a > c) System.out.println("a is max");
        else if (b > a & b > c) System.out.println("b is max");
        else System.out.println("c is max");
    }

		    
		
		}
	


