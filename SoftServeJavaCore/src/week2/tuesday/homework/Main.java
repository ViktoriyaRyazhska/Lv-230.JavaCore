package week2.tuesday.homework;

/**
 * In the method main() create 5 objects of Person type.
 * Input information about them.
 */
public class Main {
    public static void main(String[] args) {
        Person vlad = new Person("Vlad", 1996);
        Person volodymyr = new Person("Volodymyr", 1995);
        Person andrii = new Person("Andrii", 1994);
        Person victoria = new Person();
        victoria.input("Victoria", 1993);
        Person diana = new Person();
        diana.input("Diana", 1992);

        System.out.println(vlad.age());
        System.out.println(volodymyr.age());
        System.out.println(andrii.age());

        System.out.println(victoria.output());
        System.out.println(diana.output());
    }
}
