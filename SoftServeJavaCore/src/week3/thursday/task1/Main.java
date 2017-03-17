package week3.thursday.task1;

/**
 * Create array of Animal and add some Cats and Dogs to it.
 * Call voice() and feed() method for all of it.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Murka"),
                new Cat("Lucky"),
                new Dog("Rex"),
                new Dog("Jack")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            animals[i].feed();
        }
    }
}
