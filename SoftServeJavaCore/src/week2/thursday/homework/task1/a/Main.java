package week2.thursday.homework.task1.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a) read 3 float numbers and check: are they all belong to the range [-5,5];
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        float firstFloatNumber = Float.parseFloat(reader.readLine());
        float secondFloatNumber = Float.parseFloat(reader.readLine());
        float thirdFloatNumber = Float.parseFloat(reader.readLine());

        if (isInRange(firstFloatNumber) && isInRange(secondFloatNumber) && isInRange(thirdFloatNumber)) {
            System.out.println("All of these numbers are belong to the range [-5,5]");
        } else {
            System.out.println("Some of these numbers are not belong to the range [-5,5]");
        }
    }

    public static boolean isInRange(float floatNumber) {
        return ((floatNumber >= -5) && (floatNumber <= 5));
    }
}
