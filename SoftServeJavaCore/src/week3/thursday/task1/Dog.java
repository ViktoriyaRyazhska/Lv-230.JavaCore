package week3.thursday.task1;

/**
 * Create class Dog that implements Animal
 */
public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Gaf");
    }

    @Override
    public void feed() {
        System.out.println("Meet");
    }
}
