package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW13Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input price per minute for the call from the first country");
        Double c1 = Double.parseDouble(br.readLine());
        System.out.println("Input price per minute for the call from the second country");
        Double c2 = Double.parseDouble(br.readLine());
        System.out.println("Input price per minute for the call from the third country");
        Double c3 = Double.parseDouble(br.readLine());

        System.out.println("Input duration of the call from the first country");
        Double t1 = Double.parseDouble(br.readLine());
        System.out.println("Input duration of the call from the second country");
        Double t2 = Double.parseDouble(br.readLine());
        System.out.println("Input duration of the call from the third country");
        Double t3 = Double.parseDouble(br.readLine());

        Double first_cost = c1 * t1;
        Double second_cost = c2 * t2;
        Double third_country = c3 * t3;
        Double total = first_cost + second_cost + third_country;

        System.out.println(
                "Total cost for the first country " + first_cost
                + "\nTotal cost for the second country " + second_cost
                + "\nTotal cost for the third country " + third_country);
        System.out.println("Total cost for all countries " + total);
    }
}
