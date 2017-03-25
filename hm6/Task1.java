package temp;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by forest on 23.03.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        union(set1, set2);
        intersect(set1, set2);
    }
    public static void union(Set set1, Set set2){
        Set set = new HashSet(set1);
        set.addAll(set2);
        System.out.println("Union = " + set);
    }
    public static void intersect(Set set1, Set set2){
        Set set = new HashSet(set1);
        set.retainAll(set2);
        System.out.println("Intersected  = " + set);
    }
}
