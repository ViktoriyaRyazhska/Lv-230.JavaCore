package week1.tuesday.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Flower bed is shaped like a circle.
 * Calculate the perimeter and area by entering the radius.
 * Output obtained results.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        double radius;
        double perimeter, area;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        radius = Double.parseDouble(reader.readLine());

        area = Math.PI * Math.pow(radius, 2);
        perimeter = 2 * Math.PI * radius;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
