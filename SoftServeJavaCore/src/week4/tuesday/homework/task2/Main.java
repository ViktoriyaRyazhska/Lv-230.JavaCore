package week4.tuesday.homework.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
 * - Output the entities of the map on the screen.
 * - Are there at less two persons with the same firstName among these 10 people?
 * - Remove from the map person whose firstName is ”Orest” (or other). Print result.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Kuhivchak", "Vlad");
        personMap.put("Vanchosovych", "Vlad");
        personMap.put("Yarych", "Vlad");
        personMap.put("Ilkiv", "Volodymyr");
        personMap.put("Demediuk", "Bohdan");
        personMap.put("Shatsjkyh", "Viktor");
        personMap.put("Peleh", "Orest");
        personMap.put("Shitetj", "Orest");
        personMap.put("Shandrivska", "Oksana");
        personMap.put("Ilchyshyn", "Iryna");
        System.out.println(personMap);

        Set<String> set = new HashSet(personMap.values());
        if ((personMap.size() - set.size()) >= 2) {
            System.out.println("YES, there are 2 or more persons with the same firstName :)");
        } else {
            System.out.println("NO, there are no 2 or more persons with the same firstName :(");
        }

        while(personMap.values().remove("Orest"));

        System.out.println(personMap);
    }
}
