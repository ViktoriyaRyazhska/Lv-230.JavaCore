package lesson07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
// Task 1
		ArrayList<Integer>myCol = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			myCol.add(random.nextInt(20));
		}
		for (Integer integer : myCol) {
			System.out.print(integer+" ");

		}
		System.out.println();
//Task 1a		
		for (Integer integer : myCol) {
			if(integer > 5){
				System.out.print(myCol.indexOf(integer)+" ");
			}
		}
// Task 1b
		System.out.println();
			for(int i = 0; i < myCol.size(); i++) {
			if(myCol.get(i) > 20){
				myCol.remove(myCol.get(i));
			}
			}
			for (Integer integer : myCol) {
				System.out.print(integer+" ");
			}
// Task 1c
			System.out.println();
			myCol.set(1, 1);
			myCol.set(6, -3);
			myCol.set(4, -4);
			System.out.println("Position - 2"+" value - "+myCol.get(1));
			System.out.println("Position - 8"+" value - "+myCol.get(7));
			System.out.println("Position - 5"+" value - "+myCol.get(4));
			System.out.println(myCol);
// Task 1d
			System.out.println();
			Collections.sort(myCol);
			for (Integer integer : myCol) {
				System.out.print(integer+" ");
			}
	}
	
	
}
