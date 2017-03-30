package week5.tuesday.homework.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a method readNumber(int start, int end),
 * that read from console integer number and return it, if it is in the range [start...end].
 * If an invalid number or non-number text is read, the method should throw an exception.
 * Using this method write a method main(), that has to enter 10 numbers:
 * a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] range = new int[10];

        for (int i = 1; i <= 10; i++) {
            range[i - 1] = i * 9;
        }

        for (int i = 0; i < range.length; i += 2) {

            try {
                main.readNumber(range[i], range[i + 1]);
            } catch (OutOfRangeException | IOException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int readNumber(int start, int end) throws OutOfRangeException, IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputValue = Integer.parseInt(reader.readLine());

        if ((inputValue >= start) && (inputValue <= end)) {
            return inputValue;
        } else {
            throw new OutOfRangeException();
        }
    }
}
