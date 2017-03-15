package week3.tuesday.homework.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Enter 10 integer numbers.
 * Calculate the sum of first 5 elements if they are positive or
 * product of last 5 element in the other case.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];

        insertArray(array);

        int sum = calculateSum(array);

    }

    private static int calculateSum(int[] array) {
        int sum = 0;
        int n = 0;

        for (int i = 0; i < 5; i++) {
            if (array[i] < 0) {
                n = 5;
                break;
            }
        }

        for (int i = n; i < n + 5; i++) {
            sum += array[i];
        }

        return sum;
    }

    private static void insertArray(int[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        reader.close();
    }
}
