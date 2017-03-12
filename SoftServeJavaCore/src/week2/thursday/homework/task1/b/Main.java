package week2.thursday.homework.task1.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * b) read 3 integer numbers and write max and min of them;
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstIntNumber = Integer.parseInt(reader.readLine());
        int secondIntNumber = Integer.parseInt(reader.readLine());
        int thirdIntNumber = Integer.parseInt(reader.readLine());

        System.out.println("Max number is: " + max(firstIntNumber, secondIntNumber, thirdIntNumber));
        System.out.println("Mix number is: " + min(firstIntNumber, secondIntNumber, thirdIntNumber));
    }

    public static int max(int a, int b, int c) {
        if ((a > b) && (a > c)) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static int min(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }
}
