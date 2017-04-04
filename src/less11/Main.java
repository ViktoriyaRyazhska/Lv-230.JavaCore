package less11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int countCharacters = 0;
		String testWord;
		String character = "";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input word: ");
		testWord = bf.readLine();
		System.out.println("Input character: ");
		character = bf.readLine();
		for (int i = 0; i < testWord.length(); i++) {
			String test = testWord.substring(i, i + 1);
			if (character.equals(test)) {
				countCharacters++;
			}
		}
		System.out
				.println("There are character" + character + " " + countCharacters + " times in the word " + testWord);

	}

}
