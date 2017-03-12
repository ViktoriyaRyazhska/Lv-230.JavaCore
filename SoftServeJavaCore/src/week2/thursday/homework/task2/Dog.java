package week2.thursday.homework.task2;

/**
 * Сreate class Dog with fields name, breed, age.
 * - Declare enum for field breed.
 */
public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}
