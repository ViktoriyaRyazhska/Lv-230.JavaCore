package Package;

import java.util.Scanner;

public class Solution {

	public enum HTTPErrors {
		BadRequest, Unauthorized, PaymentRequired
	}

	public boolean Solution1a(double number1, double number2, double number3) {
		boolean numberInRange = true;

		if ((number1 < -5) || (number1 > 5)) {
			numberInRange = false;
		} else if ((number2 < -5) || (number2 > 5)) {
			numberInRange = false;
		} else if ((number2 < -5) || (number2 > 5)) {
			numberInRange = false;
		}

		return numberInRange;
	}

	public int Solution1bmax(int number1, int number2, int number3) {
		if ((number1 > number2) && (number1 > number3)) {
			return number1;
		} else if ((number2 > number1) && (number2 > number3)) {
			return number2;
		} else {
			return number3;
		}
	}

	public int Solution1bmin(int number1, int number2, int number3) {
		if ((number1 < number2) && (number1 < number3)) {
			return number1;
		} else if ((number2 < number1) && (number2 < number3)) {
			return number2;
		} else {
			return number3;
		}
	}

	public String NumberOFError(int mistake) {
		HTTPErrors err = null;
		switch (mistake) {
		case 400:
			err = HTTPErrors.BadRequest;
			break;
		case 401:
			err = HTTPErrors.Unauthorized;
			break;
		case 402:
			err = HTTPErrors.PaymentRequired;
			break;
		default:
			break;
		}
		return err != null ? err.toString() : "unknown mistake";
	}

	// Check if there is no two dogs with the same name.
	public boolean ChecksName(String name1, String name2, String name3) {
		boolean result = false;
		if ((name1 == name2) || (name1 == name3) || (name2 == name3)) {
            result = true;
		}
		return result;
	}

}
