package week4.tuesday.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Declare collection myCollection of 10 integers and fill it(from the console or random).
 * - Find and save in list newCollection all positions of element more than 5 in the collection.
 * Print newCollection.
 * - Remove from collection myCollection elements, which are greater then 20.
 * Print result.
 * - Insert elements 1, -3, -4 in positions 2, 8, 5.
 * Print result in the format: “position – xxx, value of element – xxx”
 * - Sort and print collection
 * - Use next Collections for this tasks: List, ArrayList, LinkedList
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add((int) (Math.random() * 61 - 30));
        }

        System.out.println("My collection: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();

        for (int i = 5; i < myCollection.size(); i++) {
            newCollection.add(myCollection.get(i));
        }

        System.out.println("New collection " + newCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }

        System.out.println("Removed items > 20: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println(
                    "Position - " + i +
                            "; Value - " + myCollection.get(i)
            );
        }

        Collections.sort(myCollection);

        System.out.println(myCollection);
    }
}

