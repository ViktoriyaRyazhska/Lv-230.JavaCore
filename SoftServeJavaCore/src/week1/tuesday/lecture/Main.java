package week1.tuesday.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * My first program.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name: ");
        String text = br.readLine();

        System.out.println("How old are you?");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Hello " + text);
        System.out.println("You are " + age);
    }
}

