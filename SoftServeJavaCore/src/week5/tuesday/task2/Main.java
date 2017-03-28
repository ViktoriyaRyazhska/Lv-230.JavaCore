package week5.tuesday.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a method for calculating the area of a rectangle int squareRectangle (int a, int b),
 * which should throw an exception if the user enters negative value.
 * Input values a and b from console.
 * Check the squareRectangle method in the method main.
 * Check to input nonnumeric value.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int a = 0;
        int b = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            System.out.println(main.squareRectangle(a, b));
        } catch (IOException | NumberFormatException | NegativeNumberException e) {
            System.err.println(e);
        }
    }

    public int squareRectangle(int a, int b) throws NegativeNumberException {
        if ((a >= 0) && (b >= 0)) {
            return a * b;
        } else {
            throw new NegativeNumberException();
        }
    }
}
