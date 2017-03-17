package hom4;

import java.io.BufferedReader;
import java.io.IOException;

public class FindPosition {

	public int PositionOfSecondnPositiveNumber(int[] array) {
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
		return position;
	}

	public int minimum(int[] array) {
		int min = array[0];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				index = i;

			}

		}
		return index;

	}

	public int enteringIntegersUntilFirstNegative(BufferedReader bf) throws NumberFormatException, IOException {
		boolean isRun = true;
		int count = 1;

		while (isRun) {
			int numbers = Integer.parseInt(bf.readLine());
			if (numbers <= 0) {
				isRun = false;
			} else if (numbers % 2 == 0) {
				count *= numbers;
			}
		}

		return count;
	}
}
