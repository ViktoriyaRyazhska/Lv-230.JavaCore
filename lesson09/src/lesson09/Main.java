package lesson09;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int a = -8;
		int b = 9;
		
		try {
			System.out.println(squareRectangle(a, b));
		} catch (NegativeException e) {
			e.printStackTrace();
		}
		
//		try {
//			Plants pl = new Plants(1, "red", "rose");
//			System.out.println(pl);
//		} catch (TypeException | ColorException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			Plants pl1 = new Plants(3, "blue", "lytik");
//		} catch (TypeException | ColorException e) {
//			e.printStackTrace();
//		}
		ArrayList<Plants>list = new ArrayList<>();
		
			try {
				list.add(new Plants(1, "red", "rose"));
			} catch (TypeException | ColorException e) {
				e.printStackTrace();
			}
			try {
				list.add(new Plants(2, "blue", "Romashka"));
			} catch (TypeException | ColorException e) {
				e.printStackTrace();
			}
			try {
				list.add(new Plants(2, "Yellow", "lytik"));
			} catch (TypeException | ColorException e) {
				e.printStackTrace();
			}
			
		for (Plants plants : list) {
			System.out.println(plants);
		}
	}
	private static int squareRectangle(int a, int b) throws NegativeException{
		if(a < 0 || b < 0){
			throw new NegativeException("Can`t be!!");
		}
		int sqr;
		return sqr = a*b;
	}

}
