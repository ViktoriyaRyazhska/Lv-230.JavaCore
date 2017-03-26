package week4.thursday.homework.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Enter a sentence that contains the words between more than one space.
 * Convert all spaces, consecutive, one.
 * For example, if we introduce the sentence:
 * "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        str = str.replaceAll("\\s+", " ");

        System.out.println(str);
    }
}
