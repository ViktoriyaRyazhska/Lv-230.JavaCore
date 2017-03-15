package week3.tuesday.homework.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Organize entering integers until the first negative number.
 * Count the product of all entered even numbers.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        while(true) {
            int inputValue = Integer.parseInt(reader.readLine());
            if (inputValue >= 0) {
                if (((inputValue % 2) == 0) && (inputValue != 0)) {
                    counter++;
                }
            } else {
                break;
            }
        }
        System.out.print("Amount of entered even numbers: " + counter);

        reader.close();
    }
}
