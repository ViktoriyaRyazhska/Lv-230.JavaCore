package com.home;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student[] arr = new Student[5];
        arr[0] = new Student("Ivan", 5);
        arr[1] = new Student("Olena", 3);
        arr[2] = new Student("Sveta", 1);
        arr[3] = new Student("Petro", 6);
        arr[4] = new Student("Tetiana", 3);

        ArrayList<Student> list = new ArrayList<Student>();
        for (int i = 0; i < arr.length; ++i) {
            list.add(arr[i]);
        }
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter course ");
        Integer course = Integer.parseInt(input.nextLine());

        Student.printStudents(list, course);*/

        //list.sort(Student::compareTo);
        //for(int i=0; i<list.size(); ++i) {
        //    System.out.println(list.get(i));
        //}
        //for(Student s : list) {
        //    System.out.println(s);

        /*list.sort(Student.getNameComparator());
        for (Student s: list){
            System.out.println(s);
        }*/

        list.sort(Student.getCourseComparator());
        for(Student k:list){
            System.out.println(k);
        }


    }
}
