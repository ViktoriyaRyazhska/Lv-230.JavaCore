package temp.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Orest", 5);
        Student s2 = new Student("Oleg", 3);
        Student s3 = new Student("Bob", 5);
        Student s4 = new Student("Steve", 3);
        Student s5 = new Student("Slavko", 4);
        Student s6 = new Student("Rick", 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        printAll(studentList);
        studentList.sort(new Student.NameComparator());
        printAll(studentList);

        System.out.println("-----------------");

        printAll(studentList);
        studentList.sort(new Student.CourseComparator());
        printAll(studentList);


    }
    public static void printAll(List list){
        for(Object l:list){
            System.out.println(l);
        }
        System.out.println();
    }
}
