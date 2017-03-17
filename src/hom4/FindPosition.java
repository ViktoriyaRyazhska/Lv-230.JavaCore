package hom4;

public class FindPosition {

	public void PositionOfSecondnPositiveNumber(int[] array) {
		int count = 0;
		int position = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				count += i;
				break;

			}

		}
		for (int j = count + 1; j < array.length; j++) {
			if (array[j] > 0) {
				position += j;
				break;
			}
		}

		System.out.println("Position of second positive number: " + position);
	}

	public void minimum(int[] array) {
		int min = array[0];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				index = i;

			}

		}
		System.out.println(min);
		System.out.println(index);

	}

	public void enteringIntegersUntilFirstNegative(int numbers) {
		boolean isRun = true;
		int count = 0;

		while (isRun) {

			if (numbers <= 0) {
				isRun = false;
			} else if (numbers % 2 == 0) {
				count++;
			}
		}

		System.out.println(count);
	}
}
