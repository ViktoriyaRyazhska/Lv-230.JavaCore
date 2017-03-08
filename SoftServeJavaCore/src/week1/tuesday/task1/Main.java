package week1.tuesday.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create Console Application project in Java.
 * In method main() write code for solving next tasks:
 * - Define integer variables a and b;
 * - Read values a and b from Console and calculate: a + b, a - b, a * b, a / b.
 * - Output obtained results.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a, b;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

    }


}
