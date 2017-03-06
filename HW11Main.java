package com.homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW11Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Hello. What is radius of the flower bad?");
        double radius = Double.parseDouble(br.readLine());
        double pi = 3.14;
        double perimetr = 2.00*pi*(radius*radius);
        double area = pi*(radius*radius);

        System.out.println("Perimetr is  " + perimetr);
        System.out.println("Area is " + area);
    }
    }

