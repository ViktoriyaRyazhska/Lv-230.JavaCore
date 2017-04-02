import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 public static void main(String [] args ) throws IOException {
	 String longest = "";
	 
	 
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter sentence which include 5 words");
	 String a = "";
	 a = br.readLine();
	System.out.println("Your sentence - " + a);
	String[] words = a.split(" ");
	for (int i = 1; i < words.length; i++) {
		if(words[i].length() > words[i-1].length()){
			longest = words[i];
		}
		}
	String ass = words[1].toString();
	StringBuffer reverseWord = new StringBuffer(ass);
	


	System.out.println("Longest word is " + longest);
	System.out.println("The longest word have " + longest.length() + " words");
	System.out.println("Reverse second word - " + reverseWord);
	
 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}
