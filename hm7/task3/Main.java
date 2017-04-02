import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Pattern USD = Pattern.compile("[$][0-9]*\\.[0-9]*");
		System.out.println("Pattern is $ enter 5 USD patterns");
		for(int i = 0; i < 5; i++){
			String textUSD = "";
			try {
				textUSD = br.readLine();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
			Matcher match = USD.matcher(textUSD);
				if(match.matches()){
					System.out.println(textUSD);
				}else{
					System.out.println("no match");
				}
		}
	}

	}



