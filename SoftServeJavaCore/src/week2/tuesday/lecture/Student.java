package week2.tuesday.lecture;

/**
 * Create Console Application project in Java.
 * Add class Student to the project.
 * Class Student should consists of two private fields:
 * - name;
 * - rating.
 * Add:
 * - properties for access to these fields;
 * - static field avgRating – average rating of all students;
 * - default constructor and constructor with parameters.
 * Methods:
 * - betterStudent - to definite the better student (between two, return true or false);
 * - toString - to output information about student;
 * - changeRating - to change the rating of student.
 */
public class Student {
    private String name;
    int rating;
    private static int number = 0;
    private static int sum = 0;

    public Student() {
        number++;
    }

    public Student(String name) {
        this.name = name;
        number++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        sum += rating;
    }

    public static double getAvgRating() {
        return (double) sum / number;
    }

    public boolean betterStudent(Student student) {
        return this.getRating() > student.getRating();
    }

    public void changeRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rating=" + rating + "]";
    }
}
