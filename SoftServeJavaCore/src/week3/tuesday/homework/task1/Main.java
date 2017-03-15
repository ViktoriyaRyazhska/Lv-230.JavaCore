package week3.tuesday.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Ask user to enter the number of month.
 * Read the value and write the amount of days in this month (create array with amount days of each month).
 */
public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Month> map = new HashMap<>();
        insertMap(map);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberMonth = Integer.parseInt(reader.readLine());
        System.out.println(map.get(numberMonth));

        reader.close();
    }

    public static void insertMap(HashMap<Integer, Month> map) {
        map.put(1, Month.JANUARY);
        map.put(2, Month.FEBRUARY);
        map.put(3, Month.MARCH);
        map.put(4, Month.APRIL);
        map.put(5, Month.MAY);
        map.put(6, Month.JUNE);
        map.put(7, Month.JULY);
        map.put(8, Month.AUGUST);
        map.put(9, Month.SEPTEMBER);
        map.put(10, Month.OCTOBER);
        map.put(11, Month.NOVEMBER);
        map.put(12, Month.DECEMBER);
    }
}
