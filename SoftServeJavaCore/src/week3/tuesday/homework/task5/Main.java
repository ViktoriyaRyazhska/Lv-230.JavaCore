package week3.tuesday.homework.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create and initialize four instances of class Car. Display cars:
 * - certain model year  (enter year in the console);
 * - ordered by the field year.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Car tesla = new Car("Tesla", 2016, 1000);
        Car bugatti = new Car("Bugatti", 2012, 5000);
        Car mercedes = new Car("Mercedes", 2002, 3000);
        Car toyota = new Car("Toyota", 1996, 500);

        Car[] cars = {tesla, bugatti, mercedes, toyota};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the year: ");
        int year = Integer.parseInt(reader.readLine());

        outputModel(year, cars);
        orderCarsByYear(cars);
    }

    private static void orderCarsByYear(Car[] cars) {
        for (int k = 0; k < cars.length - 1; k++) {
            for (int i = 0; i < cars.length - 1 - k; i++) {
                if (cars[i].getYear() < cars[i + 1].getYear()) {
                    Car temp = cars[i + 1];
                    cars[i + 1] = cars[i];
                    cars[i] = temp;
                }
            }
        }
    }

    private static void outputModel(int year, Car[] cars) {
        for (Car c : cars) {
            if (year == c.getYear()) {
                System.out.println(c.getType());
            }
        }
    }
}
