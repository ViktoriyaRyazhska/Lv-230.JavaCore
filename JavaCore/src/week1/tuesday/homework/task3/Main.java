package week1.tuesday.homework.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Phone calls from three different countries are с1, с2 and с3 standard units per minute.
 * Talks continued t1, t2 and t3 minutes.
 * How much computer will count for each call separately and all talk together?
 * Input all source data from console, make calculations and output to the screen.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int c1, c2, c3;
        int t1, t2, t3;
        int costOfFirstCall, costOfSecondCall, costOfThirdCall;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the price for the first country: ");
        c1 = Integer.parseInt(reader.readLine());
        System.out.print("How  many minutes was a call? ");
        t1 = Integer.parseInt(reader.readLine());

        System.out.print("Enter the price for the second country: ");
        c2 = Integer.parseInt(reader.readLine());
        System.out.print("How  many minutes was a call? ");
        t2 = Integer.parseInt(reader.readLine());

        System.out.print("Enter the price for the third country: ");
        c3 = Integer.parseInt(reader.readLine());
        System.out.print("How  many minutes was a call? ");
        t3 = Integer.parseInt(reader.readLine());

        costOfFirstCall = c1 * t1;
        costOfSecondCall = c2 * t2;
        costOfThirdCall = c3 * t3;

        System.out.println("You should pay: ");
        System.out.println("1) For the first call: " + costOfFirstCall);
        System.out.println("2) For the second call: " + costOfSecondCall);
        System.out.println("3) For the third call: " + costOfThirdCall);

        System.out.println("Total: " + (costOfFirstCall + costOfSecondCall + costOfThirdCall));

    }
}
