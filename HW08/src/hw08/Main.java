package hw08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {

//Task 1		
//		System.out.println("eNTER SENTENCE of 5 words");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String sentence = br.readLine();
//		String[] words = sentence.split(" ");
//		String longest = null;
//		for (int i = 1; i < words.length; i++) {
//			if(words[i].length() > words[i-1].length()){
//				longest = words[i];
//			}
//		}
//		System.out.println(longest);
//		System.out.println(longest.length());
//		System.out.println(new StringBuilder(words[1]).reverse().toString());
		
// Task 2
		String str = "I    am      learning     Java   Core";
		String replaced = "";
//		System.out.println(str.substring(0).replaceAll("[ ]*", " "));
		Pattern p = Pattern.compile("[ ]{2,}");
		Matcher m = p.matcher(str);
		while(m.find()){
			replaced = str.replaceAll(str.substring(m.start(), m.end()), " ");
//			System.out.println(str.substring(m.start(), m.end()).replace);
		}
		System.out.println(replaced);
	}

}
