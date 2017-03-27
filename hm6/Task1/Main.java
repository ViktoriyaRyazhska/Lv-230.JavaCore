import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(6);

        Set<Integer> resultUnion = main.union(numbers, numbers1);
        Set<Integer> resultIntersect = main.intersect(numbers, numbers1);

        System.out.println(resultUnion);
        System.out.println(resultIntersect);
    }

    public Set union(Set set1, Set set2) {
        Set set = new HashSet(set1);
        set.addAll(set2);

        return set;
    }

    public Set intersect(Set set1, Set set2) {
        Set set = new HashSet(set1);
        set.retainAll(set2);

        return set;
    }
}