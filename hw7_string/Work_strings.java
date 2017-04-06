package hw7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Work_strings {

	public static void main(String[] args) {
		
	//task 1	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter in the console sentence of five words.");
	String p = "[\\W]";
	String[] line = sc.nextLine().split(p);
	
	String longestWord = line[0];
	for (int i=1; i<line.length; i++){
		if(longestWord.length() < line[i].length()){
			longestWord = line[i];
		}
	}
	System.out.println("Longest word: " + longestWord + "  " + "consist of " + longestWord.length() + " letters.");
	
	System.out.println("Second word in reverse order: " + new StringBuffer(line[1]).reverse().toString());
	
	
	//task 2
	
	
	System.out.println("Please enter in the console sentence with two space.");
	String line1 = sc.nextLine();//"I    am      learning     Java   Core";
	line1 = line1.replaceAll("\\s+", " ");
	
	System.out.println(line1);
	
	
	
	//task3
	
	System.out.println("Please enter in the console sentence with US currency.");
	String line2 = sc.nextLine();
	Pattern p1 = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
	Matcher m = p1.matcher(line2);
	
	while (m.find()) {
		System.out.println(line2.substring(m.start(), m.end()));
	}
	sc.close();
}

	
}