package week4.thursday.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
 * - surname and initials;
 * - name;
 * - name, middle name and last name.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name, surname, patronymic;

        System.out.println("Enter your surname: ");
        surname = reader.readLine();
        System.out.println("Enter your name: ");
        name = reader.readLine();
        System.out.println("Enter your patronymic: ");
        patronymic = reader.readLine();

        System.out.println(surname + " " +
                name.substring(0, 1) + ". " +
                patronymic.substring(0, 1) + ". ");

        System.out.println(name);

        System.out.println(name + " " + patronymic + " " + surname);
    }
}
