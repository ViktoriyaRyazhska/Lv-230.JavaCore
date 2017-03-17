package week3.thursday.task1;

/**
 * Create class Cat that implements Animal
 */
public class Cat implements Animal{
    private String name;

    public Cat(String name) {
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
        System.out.println("Miaw");
    }

    @Override
    public void feed() {
        System.out.println("Fish");
    }
}
