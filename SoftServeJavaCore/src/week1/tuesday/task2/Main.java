package week1.tuesday.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create Console Application project in Java.
 * In method main() write code for solving next tasks:
 * - Output question “How are you?“.
 * - Define string variable answer.
 * - Read the value answer and output: “You are (answer)".
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How are you?");
        String answer = reader.readLine();

        System.out.println("You are " + answer);

    }
}
