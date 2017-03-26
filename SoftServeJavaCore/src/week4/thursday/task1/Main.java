package week4.thursday.task1;

/**
 * Enter the two variables of type String.
 * Determine whether the first variable substring second.
 * For example, if you typed «IT» and «IT Academy» you must receive true.
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "IT";
        String s2 = "IT Academy";

        System.out.println(s2.contains(s1));
    }
}
