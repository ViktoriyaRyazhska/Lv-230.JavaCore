package week5.tuesday.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create method div(), which calculates the dividing of two double numbers.
 * In main method input 2 double numbers and call this method.
 * Catch all exceptions.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        double a = 0.0;
        double b = 0.0;
        double result = 0.0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            a = Double.parseDouble(reader.readLine());
            b = Double.parseDouble(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
        }

        result = main.div(a, b);
        System.out.println(result);
    }

    public double div(double a, double b) {
        return a / b;
    }
}
