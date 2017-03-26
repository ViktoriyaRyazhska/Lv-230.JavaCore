package temp.hm7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter US currency: ");
        String in = bufferedReader.readLine();
        Pattern pattern = Pattern.compile("\\$(\\d*)(\\.\\d{0,2})?");
        Matcher matcher = pattern.matcher(in);

        while (matcher.find()) {
            System.out.print(in.substring(matcher.start(), matcher.end()));
        }
    }
}
