package week4.tuesday.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * In the main() method declare map employeeMap of pairs <Integer, String>.
 * - Add to employeeMap seven pairs (ID, name) of some persons.
 * Display the map on the screen.
 * - Ask user to enter ID, then find and write corresponding name from your map.
 * If you can't find this ID - say about it to user (use function containsKey()).
 * - Ask user to enter name, verify than you have name in your map and write corresponding ID.
 * If you can't find this name - say about it to user (use function containsValue()).
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Vlad");
        employeeMap.put(2, "Vlad");
        employeeMap.put(3, "Eduard");
        employeeMap.put(4, "Andrii");
        employeeMap.put(5, "Stepan");
        employeeMap.put(6, "Vova");
        employeeMap.put(7, "Petro");

        System.out.println(employeeMap);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write ID: ");
        int id = Integer.parseInt(reader.readLine());
        if (employeeMap.containsKey(id)) {
            System.out.println("User name: " + employeeMap.get(id));
        } else {
            System.out.println("I can`t find user with this ID!");
        }

        System.out.print("Write Name: ");
        String name = reader.readLine();
        if (employeeMap.containsValue(name)) { // Can we find keys by value simpler ???
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (name.equals(entry.getValue())) {
                    System.out.println("Name = " + name + "; ID = " + entry.getKey());
                }
            }
        } else {
            System.out.println("I can`t find user with this ID!");
        }
    }
}
