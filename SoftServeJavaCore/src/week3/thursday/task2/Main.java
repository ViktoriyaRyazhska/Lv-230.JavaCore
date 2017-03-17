package week3.thursday.task2;

/**
 * Create array of Person and add some Teachers, Cleaners and Students to it.
 * Call method print() for all of it.
 * Call method salary() for all Teachers and Cleaners.
 */
public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Teacher(100, 10),
                new Cleaner(50, 5),
                new Student()
        };

        for (Person p : persons) {
            p.print();
        }

        for (Person p : persons) {
            if (p instanceof Staff) {
                System.out.println(((Staff) p).salary());
            }
        }
    }
}
