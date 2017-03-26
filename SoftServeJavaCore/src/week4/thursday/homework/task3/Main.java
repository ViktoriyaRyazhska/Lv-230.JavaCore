package week4.thursday.homework.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implement a pattern for US currency:
 * the first symbol "$", then any number of digits, dot and two digits after the dot.
 * Enter the text from the console that contains several occurrences of US currency.
 * Display all occurrences on the screen.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String currency = reader.readLine();
            if (checkUSCurrency(currency)) {
                System.out.println(currency);
                break;
            } else {
                System.out.println("Try one more time!");
            }
        }
    }

    public static boolean checkUSCurrency(String currency) {
        Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
        Matcher m = p.matcher(currency);

        return m.matches();
    }
}
