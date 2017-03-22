package week4.tuesday.homework.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * - In the main() method declare List students and add to the list five different students
 * display the list of students ordered by name
 * display the list of students ordered by course.
 */
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vlad", 1));
        students.add(new Student("Andrii", 2));
        students.add(new Student("Volodymyr", 5));
        students.add(new Student("Viktor", 3));
        students.add(new Student("Petro", 4));

        Collections.sort(students, Student.getNameComparator());
        System.out.println(students);

        Collections.sort(students, Student.getCourseComparator());
        System.out.println(students);
    }
}
