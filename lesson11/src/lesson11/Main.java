package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		
		int countCharachters = 0;
		String testWord = null;
		String character = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input word");
		try {
			testWord = br.readLine();
		} catch (IOException e1) {}
		System.out.println("Input char");
		try {
			character = br.readLine();
		} catch (IOException e) {}
		
		for (int i = 0; i < testWord.length(); i++) {
			String test = testWord.substring(i, i+1);
			if(test.equals(character)){
				countCharachters++;
			}
		}
		System.out.println("There are character "+ character+ " "+ countCharachters+" times in the word "+testWord);
	}

}
