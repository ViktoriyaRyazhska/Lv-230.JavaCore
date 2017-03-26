package week4.thursday.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Enter in the console sentence of five words.
 * - display the longest word in the sentence;
 * - determine the number of it`s letters;
 * - bring the second word in reverse order.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();
        sentence = sentence.toLowerCase();
        ArrayList<String> wordsList = getStringWords(sentence);

        String longestWord = getLongestWord(wordsList);
        System.out.println(longestWord);
        System.out.println(longestWord.length());

        String secondReverseWord = new StringBuilder(wordsList.get(1)).reverse().toString();
        System.out.println(secondReverseWord);
    }

    private static String getLongestWord(ArrayList<String> wordList) {
        int max = wordList.get(0).length();
        String word = wordList.get(0);

        for (int i = 1; i < wordList.size(); i++) {
            if (wordList.get(i).length() > max) {
                max = wordList.get(i).length();
                word = wordList.get(i);
            }
        }

        return word;
    }

    public static ArrayList<String> getStringWords(String sentence) {
        ArrayList<String> wordsList = new ArrayList<>();

        String pattern = "[a-z]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);

        while (m.find()) {
            wordsList.add(sentence.substring(m.start(), m.end()));
        }

        return wordsList;
    }
}
