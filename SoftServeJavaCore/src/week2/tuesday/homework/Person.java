package week2.tuesday.homework;

import java.util.Calendar;

/**
 * Create Console Application project in Java.
 * Add class Person to the project.
 * Class Person should consists of two private fields:
 * - name;
 * - birthYear (the birthday year).
 * Add:
 * - properties for access to these fields;
 * - default constructor and constructor with 2 parameters.
 * Methods:
 * - age - to calculate the age of person;
 * - input - to input information about person;
 * - output - to output information about person;
 * - changeName - to change the name of person.
 */
public class Person {
    private String name;
    private int birthYear;

    // Constructors
    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Methods
    public int age() {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        return year - getBirthYear();
    }

    public void input(String name, int birthYear) {
        setName(name);
        setBirthYear(birthYear);
    }

    public String output() {
        return toString();
    }

    public void changeName(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
