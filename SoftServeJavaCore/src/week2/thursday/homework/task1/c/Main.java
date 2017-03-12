package week2.thursday.homework.task1.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * c) read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError).
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfHTTPError = Integer.parseInt(reader.readLine());
        getErrorInformation(numberOfHTTPError);
    }

    public static void getErrorInformation(int id) {
        switch (id) {
            case 400:
                System.out.println(HTTPError.BAD_REQUEST);
                break;
            case 401:
                System.out.println(HTTPError.UNAUTHORIZED);
                break;
            case 402:
                System.out.println(HTTPError.PAYMENT_REQUIRED);
                break;
            case 403:
                System.out.println(HTTPError.FORBIDDEN);
                break;
            case 404:
                System.out.println(HTTPError.NOT_FOUND);
                break;
            default:
                System.out.println("Incorrect number of the error.");
                break;
        }
    }
}
