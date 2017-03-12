package week2.thursday.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Enter the number of the day of the week. Display the name in three languages.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Write number of the week [1-7]: ");
        int numberOfDay = Integer.parseInt(reader.readLine());

        switch (numberOfDay) {
            case 1:
                System.out.println("UKR: понеділок\nFRA: lundi\nJPN: 月曜日");
                break;
            case 2:
                System.out.println("UKR: вівторок\nFRA: mardi\nJPN: 火曜日");
                break;
            case 3:
                System.out.println("UKR: середа\nFRA: mercredi\nJPN: 水曜日");
                break;
            case 4:
                System.out.println("UKR: четвер\nFRA: jeudi\nJPN: 木曜日");
                break;
            case 5:
                System.out.println("UKR: п'ятниця\nFRA: vendredi\nJPN: 金曜日");
                break;
            case 6:
                System.out.println("UKR: субота\nFRA: samedi\nJPN: 土曜日");
                break;
            case 7:
                System.out.println("UKR: неділя\nFRA: dimanche\nJPN: 日曜日");
                break;
            default:
                System.out.println("Wrong number!");
                break;
        }
    }
}
