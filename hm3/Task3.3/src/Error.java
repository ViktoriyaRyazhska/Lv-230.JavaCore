import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Error {
  public static void main(String[] args) throws IOException {                             
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please write number of your error:1)400;2)401;3)402");
	
		int number = 0;
		switch(number = Integer.parseInt(br.readLine())){
		case 400:
			System.out.println("400 Bad Request");
			break;
		case  401:
			System.out.println("401 Unauthorized");
			break;
		case 402:
			System.out.println("402 Payment Required");
		break;
		
		
		}
	
	
	
	
	
	
	}

}
