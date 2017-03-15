package week3.tuesday.task1;

/**
 * Create an array of ten integers.
 * Display:
 * - the biggest of these numbers;
 * - the sum of positive numbers in the array;
 * - the amount of negative numbers in the array.
 */
public class Main {
    public static void main(String[] args) {

        int[] array = {-1, -5, 0, 1, 2, 5, 4, 3, -4};
        int maxValue = max(array);
        int sumPositives = calculateSumPositives(array);
        int amountNegatives = calculateAmountNegatives(array);
        int amountPositives = calculateAmountPositives(array);

        System.out.print("Max value of the array: " + maxValue);
        System.out.print("Sum of positive numbers: " + sumPositives);
        System.out.print("Amount of negative numbers: " + amountNegatives);

        if (amountNegatives > amountPositives) {
            System.out.println("Negatives are more.");
        } else if (amountPositives > amountNegatives) {
            System.out.println("Positives are more.");
        } else {
            System.out.println("The same number of these values.");
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int calculateSumPositives(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int calculateAmountNegatives(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static int calculateAmountPositives(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
