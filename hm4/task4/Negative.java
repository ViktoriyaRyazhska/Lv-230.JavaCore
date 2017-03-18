import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Negative {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int numbers = 0;
int ammount = 0;
	while(numbers >= 0){
	numbers = Integer.parseInt(br.readLine());
	if (((numbers % 2) == 0) && (numbers != 0)){
	ammount++;	
	}
	
}
		System.out.println(ammount);
br.close();
	}
	
}
