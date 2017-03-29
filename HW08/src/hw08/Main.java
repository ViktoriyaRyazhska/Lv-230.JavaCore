package hw08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args){

//Task 1		
		System.out.println("Enter sentence of 5 words");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = "";
		try {
			sentence = br.readLine();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		String[] words = sentence.split(" ");
		String longest = null;
		for (int i = 1; i < words.length; i++) {
			if(words[i].length() > words[i-1].length()){
				longest = words[i];
			}
		}
		System.out.println("Longest word in sentence is: "+longest);
		System.out.println("Length of longest word is: "+longest.length());
		System.out.println("Reverse of second word: "+new StringBuilder(words[1]).reverse().toString());
		
// Task 2
		String str = "I    am      learning     Java   Core";
		System.out.println("Original sentence: "+str);
		System.out.println("Sentence without whitespaces: "+str.replaceAll(" +", " "));
		System.out.println();
//Task 3
		Pattern usd = Pattern.compile("[$][0-9]*\\.[0-9]*");
		System.out.println("Pattern is $.. . .. enter 5 USD patterns");
		for(int i = 0; i < 5; i++){
			String textUSD = "";
			try {
				textUSD = br.readLine();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
			Matcher match = usd.matcher(textUSD);
				if(match.matches()){
					System.out.println(textUSD);
				}else{
					System.out.println("no match");
				}
		}
	}
}
