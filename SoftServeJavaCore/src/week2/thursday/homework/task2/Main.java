package week2.thursday.homework.task2;

/**
 * - Create 3 instances of type Dog.
 * - Check if there is no two dogs with the same name.
 * - Display the name and the kind of the oldest dog.
 */
public class Main {

    public static void main(String[] args) {
        Dog leslie = new Dog("Leslie", Breed.DALMATIAN, 5);
        Dog lucky = new Dog("Lucky", Breed.JAPANESE_CHIN, 10);
        Dog bux = new Dog("Bux", Breed.DOBERMAN, 7);

        if (hasSameName(leslie, lucky, bux)) {
            System.out.println("There are dogs with the same names.");
        } else {
            System.out.println("There are no dogs with the same names.");
        }

        Dog theOldestDog = getTheOldestDog(leslie, lucky, bux);
        System.out.println("The oldest dog is:\n" +
                    "Name: " + theOldestDog.getName() + "\n" +
                    "Breed: " + theOldestDog.getBreed());
    }

    public static boolean hasSameName(Dog dog1, Dog dog2, Dog dog3) {
        return (dog1.getName().equals(dog2.getName()) ||
                dog1.getName().equals(dog3.getName()) ||
                dog2.getName().equals(dog3.getName()));
    }

    public static Dog getTheOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            return dog1;
        } else if (dog2.getAge() > dog3.getAge()) {
            return dog2;
        } else {
            return dog3;
        }
    }
}
