package temp.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Orest", 5));
        studentList.add(new Student("Oleg", 3));
        studentList.add(new Student("Bob", 5));
        studentList.add(new Student("Steve", 3));
        studentList.add(new Student("Slavko", 4));
        studentList.add(new Student("Rick", 3));

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
