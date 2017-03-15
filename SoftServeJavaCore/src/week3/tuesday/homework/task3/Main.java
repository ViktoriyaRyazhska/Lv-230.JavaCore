package week3.tuesday.homework.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Enter 5 integer numbers. 
 * Find:
 * - position of second positive number;
 * - minimum and its position in the array.
 */
    public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            int inputValue = Integer.parseInt(reader.readLine());
            array[i] = inputValue;
        }
        
        int positivePosition = getPositiveNumberPosition(array, 2);
        int mininumNumber = getMinimumNumber(array);
        int minimumPosition = getMinimumNumberPosition(array);

        reader.close();
    }

    private static int getMinimumNumberPosition(int[] array) {
        int min = getMinimumNumber(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                return i;
            }
        }
        return  -1;
    }

    private static int getMinimumNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int getPositiveNumberPosition(int[] array, int number) {
        int accum = 1;
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (accum == number) {
                    position = i;
                    break;
                } else {
                    accum++;
                }
            }
        }
        return position;
    }


}
