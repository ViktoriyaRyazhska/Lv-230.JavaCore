package week3.thursday.task2;

/**
 * In other classes in body of method print() output text “I am a …”.
 * In each concrete class create constant TYPE_PERSON.
 * Output type of person in each constructors.
 */
public class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student() {
        System.out.println(Student.TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a student.");
    }
}
