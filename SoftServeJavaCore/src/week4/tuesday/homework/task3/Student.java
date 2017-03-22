package week4.tuesday.homework.task3;

import java.util.Comparator;
import java.util.List;

/**
 * Write class Student that provides information about the name of the student and his course.
 * Class Student should consists of:
 * - properties for access to these fields
 * - constructor with parameters
 * - method printStudents (List students, Integer course),
 * which receives a list of students and the course number and
 * prints to the console the names of the students from the list, which are taught in this course (use an iterator)
 * - methods to compare students by name and by course
 */
public class Student {
    private String name;
    private Integer course;
    private static NameComparator nameComparator = new NameComparator( );
    private static CourseComparator courseComparator = new CourseComparator();

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public void printStudents(List<Student> students, Integer course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                System.out.println(students.get(i).getName());
            }
        }
    }

    public static Comparator getNameComparator( ) {
        return nameComparator;
    }

    public static Comparator getCourseComparator( ) {
        return courseComparator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    static class NameComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getName().compareTo(((Student)o2).getName());
        }
    }

    static class CourseComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getCourse() - ((Student)o2).getCourse();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
