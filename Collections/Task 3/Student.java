package com.home;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kitty on 3/24/17.
 */
public class Student {
    public String name;
    public Integer course;


    public String getName(){
        return name;
    }

    public Integer getCourse(){
        return course;
    }

    Student (String name, Integer course){
        this.name = name;
        this.course = course;
    }

    static public void printStudents(List<Student> list, Integer course){
            for(Student s : list){
                if(course.equals(s.getCourse())){
            System.out.println(s.getName());
                }
            }
    }

    //@Override
    //public int compareTo(Student student) {
    //   return getName().compareToIgnoreCase(student.getName());
    //}



    @Override

    public String toString(){
        return "[ Name " + getName() + " Course " + getCourse() + "]\n";
      }

    static NameComparator nameComparator = new NameComparator();

    public static Comparator getNameComparator() {
        return nameComparator;
    }
    static CourseComparator courseComparator = new CourseComparator();

    public static Comparator getCourseComparator() {
        return courseComparator;
    }

    //@Override
    //public int compareTo(Student student) {
    //    return getName().compareToIgnoreCase(student.getName());
    //}
}
