package hom4;

public class SumOfNumber {

	public void CalculateSumOfFirstElements(int[] array) {
		array = new int[10];
		int sumFirts = 0;
		int sumLast = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * 5) - 5);
			System.out.print(array[i] + ", ");
			if (i <= 4) {
				if (array[i] >= 0) {
					sumFirts += array[i];
				}
			} else {
				sumLast += array[i];
			}
		}
		System.out.println();
		System.out.println("Sum of first 5 elements: " + sumFirts);
		System.out.println("Sum of last 5 elements: " + sumLast);
	}

}
