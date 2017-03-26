package week4.thursday.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
 * Using regular expressions implement checking the user name for validity.
 * Input five names in the main method.
 * Output a message to the console of the validation of each of the entered names.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        System.out.println(checkWithRegExp(name1));

        String name2 = reader.readLine();
        System.out.println(checkWithRegExp(name2));

        String name3 = reader.readLine();
        System.out.println(checkWithRegExp(name3));

        String name4 = reader.readLine();
        System.out.println(checkWithRegExp(name4));

        String name5 = reader.readLine();
        System.out.println(checkWithRegExp(name5));
    }


    public static boolean checkWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);

        return m.matches();
    }
}
