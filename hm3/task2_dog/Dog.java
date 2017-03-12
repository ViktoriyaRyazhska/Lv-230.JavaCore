import java.util.ArrayList;

public class Dog {
    private String name;
    private int age;
    BreedOfDogs breedOfDogs ;

    public Dog(String name, int age, BreedOfDogs breedOfDogs) {
        this.name = name;
        this.age = age;
        this.breedOfDogs = breedOfDogs;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.breedOfDogs = BreedOfDogs.STRAY_DOG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name of dog: "+name+", age is: "+age+", breed is: "+breedOfDogs;
    }
}
