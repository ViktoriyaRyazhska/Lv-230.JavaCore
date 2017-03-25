package temp.task2;

import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    static NameComparator nameComparator = new NameComparator();
    static CourseComparator courseComparator = new CourseComparator();


    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public CourseComparator getCourseComparator() {
        return courseComparator;
    }

    public NameComparator getNameComparator() {
        return nameComparator;
    }

    public void printStudent(List<Student> studentList, Integer course){
        for(Student student:studentList){
            if(student.getCourse()==course){
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return getName()+" - "+getCourse();
    }
    static class NameComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getName().compareTo(((Student)o2).getName());
        }
    }
    static class CourseComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getCourse() - (((Student)o2).getCourse());
        }
    }

}

