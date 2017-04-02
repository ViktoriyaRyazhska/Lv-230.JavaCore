package homework7Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		
// 1) Enter in the console sentence of five words. 
//		-display the longest word in the sentence
//		-determine the number of its letters
//		-bring the second word in reverse order
		
		System.out.println("Task1");
		
		System.out.println("Please enter sentence of five words!");
		String pattern1 = "[\\W]+";
		String[] sentence1 = br.readLine().split(pattern1);
		
		String longestWord = sentence1[0];
		for (int i=1; i<sentence1.length; i++){
			if(longestWord.length() < sentence1[i].length()){
				longestWord = sentence1[i];
			}
		}
		System.out.println("Longest word in the sentence is: " + longestWord + ". "
							+ "It hconsist of " + longestWord.length() + " letters.");
		
		System.out.println("Reversed second word in the sentence is: " + 
							new StringBuffer(sentence1[1]).reverse().toString());
		
		System.out.println();
		
// 2) Enter a sentence that contains the words between more than one space.
// Convert all spaces, consecutive, one.
// For example, if we introduce the sentence "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»
		
		System.out.println("Task2");
		
		System.out.println("Please enter sentence that contains the words between more than one space!");
		String sentence2 =  br.readLine();
		
		while(sentence2.contains("  ")){
			sentence2 = sentence2.replace("  ", " ");
		}
		System.out.println("Sentence without extra space: ");
		System.out.println(sentence2);
		System.out.println();

// 3) Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and two digits after the dot.
// Enter the text from the console that contains several occurrences of US currency. Display all occurrences on the screen.
		
		System.out.println("Task3");
		
		System.out.println("Please enter sentence that contains several occurrences of US currency!");
		String sentence3 =  br.readLine();
		
		Pattern pattern3 = Pattern.compile("\\$(\\d*)(\\.\\d{0,2})?");
		Matcher match = pattern3.matcher(sentence3);
		
		while (match.find()) {
			System.out.println(sentence3.substring(match.start(), match.end()));
		}
		
		
	}
	
}
