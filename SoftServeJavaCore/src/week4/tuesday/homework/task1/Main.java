package week4.tuesday.homework.task1;

import java.util.HashSet;
import java.util.Set;

/**
 * Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
 * realizing the operations of union and intersection of two sets.
 *
 * Test the operation of these techniques on two pre-filled sets.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Set<Integer> firts = new HashSet<>();
        firts.add(1);
        firts.add(2);
        firts.add(3);
        firts.add(4);
        Set<Integer> second = new HashSet<>();
        second.add(3);
        second.add(4);
        second.add(5);
        second.add(6);

        Set<Integer> resultUnion = main.union(firts, second);
        Set<Integer> resultIntersect = main.intersect(firts, second);

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
