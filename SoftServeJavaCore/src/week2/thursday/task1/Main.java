package week2.thursday.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Enter three numbers. Find out how many of them are odd.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());

        if ((firstNumber % 2) != 0) {
            counter++;
        }

        if ((secondNumber % 2) != 0) {
            counter++;
        }

        if ((thirdNumber % 2) != 0) {
            counter++;
        }

        System.out.println("Number of ODD numbers: " + counter);
    }
}
