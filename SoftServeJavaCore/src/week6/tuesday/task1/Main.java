package week6.tuesday.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Debug.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int countCharacters = 0;
        String testWord;
        String character;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();

        System.out.println("Input character");
        character = br.readLine();

        for (int i = 0; i < testWord.length(); i++) {
            // Added new variable and changed (1, 1) -> (i, i + 1)
            String character1 = testWord.substring(i, i + 1);
            if (character1.equals(character)) {
                countCharacters++;
            }
        }
        System.out.println("There are character" + character + " " + countCharacters + " times in the word " + testWord);
    }
}
