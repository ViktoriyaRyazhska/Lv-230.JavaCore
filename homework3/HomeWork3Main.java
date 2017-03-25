package homework3;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork3Main {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);

		Scanner userInput = new Scanner(System.in);

// 1.a) read 3 float numbers and check: are they all belong to the range
// [-5,5]
// (User input):
		System.out.println("Please enter float number 1:");
		float floatN1 = userInput.nextFloat();
		System.out.println("Please enter float number 2:");
		float floatN2 = userInput.nextFloat();
		System.out.println("Please enter float number 3:");
		float floatN3 = userInput.nextFloat();
// 1.a) read 3 float numbers and check: are they all belong to the range
// [-5,5]
// (Results output):
		if (floatNumbersWithinTheRange(floatN1, floatN2, floatN3)) {
			System.out.println("All three numbers are within the range[-5;5]");
		} else {
			System.out.println("One or more numbers are not within the range[-5;5]");
		}

// 1.b) read 3 integer numbers and write max and min of them
// (User input):
		System.out.println("Please enter integer number 1:");
		int integerN1 = userInput.nextInt();
		System.out.println("Please enter integer number 2:");
		int integerN2 = userInput.nextInt();
		System.out.println("Please enter integer number 3:");
		int integerN3 = userInput.nextInt();
// 1.b) read 3 integer numbers and write max and min of them
// (Results output):
		if (areEnteredNumbersEqual(integerN1, integerN2, integerN3)) {
			System.out.println("All three numbers are equal to " + integerN1);
		} else {
			System.out.println("Max. number is " + getMaxNumber(integerN1, integerN2, integerN3));
			System.out.println("Min. number is " + getMinNumber(integerN1, integerN2, integerN3));
		}

// 1.c) read number of HTTP Error (400, 401,402, ...) and write the name
// of this error (Declare enum HTTPError)
// (User input):
		System.out.println("Please enter the number of the HTTP Error:");
		int httpErrorNumber = userInput.nextInt();
// 1.c) read number of HTTP Error (400, 401,402, ...) and write the name
// of this error (Declare enum HTTPError)
// (Results output):
		System.out.println("Name of the HTTP Error is: " + httpErrorIDCheck(httpErrorNumber));

		userInput.close();

// 2 Ñreate class Dog with fields name, breed, age.
// b) Create 3 instances of type Dog:
		Dog dog1 = new Dog("Rassie", Breed.AiredaleTerrier, 3);
		Dog dog2 = new Dog("White Fang", Breed.AlaskanMalamute, 3);
		Dog dog3 = new Dog("Lassie", Breed.Collie, 7);

// 2 Ñreate class Dog with fields name, breed, age.
// c) Check if there is no two dogs with the same name.
// (Results output):
		if (!(dog1.sameNameCheck(dog2)) && !(dog1.sameNameCheck(dog3)) && !(dog2.sameNameCheck(dog3))) {
			System.out.println("There are no two dogs with the same name!");
		} else {
			if (dog1.sameNameCheck(dog2) && dog1.sameNameCheck(dog3) && dog2.sameNameCheck(dog3) && !(dog1.equals(dog2))
					&& !(dog1.equals(dog3)) && !(dog2.equals(dog3))) {
				System.out.println(" All there dogs have the same name!" + dog1.getName());
			}
			if (dog1.sameNameCheck(dog2) && !(dog1.equals(dog2))) {
				System.out.println(dog1.getAge() + " years old " + dog1.getBreed() + " and " + dog2.getAge()
						+ " years old " + dog2.getBreed() + "have the same name: " + dog1.getName());
			}
			if (dog1.sameNameCheck(dog3) && !(dog1.equals(dog3))) {
				System.out.println(dog1.getAge() + " years old " + dog1.getBreed() + " and " + dog3.getAge()
						+ " years old " + dog3.getBreed() + "have the same name: " + dog1.getName());
			}
			if (dog2.sameNameCheck(dog3) && !(dog2.equals(dog3))) {
				System.out.println(dog2.getAge() + " years old " + dog2.getBreed() + " and " + dog3.getAge()
						+ " years old " + dog3.getBreed() + "have the same name: " + dog2.getName());
			}

		}
// 2 Ñreate class Dog with fields name, breed, age
// d) Display the name and the kind of the oldest dog
// (Results output):
		if (dog1.sameAgeCheck(dog2) && dog1.sameAgeCheck(dog3)) {
			System.out.println("All dogs are the same age");
		}

		if (dog1.sameAgeCheck(dog2) && !(dog1.sameAgeCheck(dog3))) {
			if (dog1.dogAgeComparrison(dog3)) {
				System.out.println("Following dogs are the oldest one:");
				System.out.println(dog1 + " and " + dog2);
			} else {
				System.out.println("Following dog is the oldest one:");
				System.out.println(dog3);
			}
		}

		if (dog1.sameAgeCheck(dog3) && !(dog1.sameAgeCheck(dog2))) {
			if (dog1.dogAgeComparrison(dog2)) {
				System.out.println("Following dogs are the oldest one:");
				System.out.println(dog1 + " and " + dog3);
			} else {
				System.out.println("Following dog is the oldest one:");
				System.out.println(dog2);
			}
		}

		if (dog2.sameAgeCheck(dog3) && !(dog2.sameAgeCheck(dog1))) {
			if (dog2.dogAgeComparrison(dog1)) {
				System.out.println("Following dogs are the oldest one:");
				System.out.println(dog2 + " and " + dog3);
			} else {
				System.out.println("Following dog is the oldest one:");
				System.out.println(dog1);
			}
		}
		
		if (!(dog1.sameAgeCheck(dog2) || dog1.sameAgeCheck(dog3) || dog2.sameAgeCheck(dog3))) {
			System.out.println("Following dog is the oldest one:");
			if (dog1.dogAgeComparrison(dog2) && dog1.dogAgeComparrison(dog3)) {
				System.out.println(dog1);
			} else {
				if (dog2.dogAgeComparrison(dog1) && dog2.dogAgeComparrison(dog3)) {
					System.out.println(dog2);
				} else {
					System.out.println(dog3);
					}
				}
			}

		}
	

	// 1.a) read 3 float numbers and check: are they all belong to the range
	// [-5,5]
	// (Solution method)
	public static boolean floatNumbersWithinTheRange(float floatN1, float floatN2, float floatN3) {
		boolean solution1A = ((floatN1 >= -5) && (floatN1 <= 5) && (floatN2 >= -5) && (floatN2 <= 5) && (floatN3 >= -5)
				&& (floatN3 <= 5)) ? true : false;
		return solution1A;
	}

	// 1.b) read 3 integer numbers and write max and min of them
	// (Solution methods)
	public static boolean areEnteredNumbersEqual(int integerN1, int integerN2, int integerN3) {
		return (integerN1 == integerN2) && (integerN1 == integerN3);
	}

	public static int getMaxNumber(int integerN1, int integerN2, int integerN3) {
		if ((integerN1 >= integerN2) && (integerN1 >= integerN3)) {
			return (integerN1);
		} else {
			if ((integerN2 >= integerN1) && (integerN2 >= integerN3)) {
				return (integerN2);
			} else {
				return (integerN3);
			}
		}
	}

	public static int getMinNumber(int integerN1, int integerN2, int integerN3) {
		if ((integerN1 <= integerN2) && (integerN1 <= integerN3)) {
			return (integerN1);
		} else {
			if ((integerN2 <= integerN1) && (integerN2 <= integerN3)) {
				return (integerN2);
			} else {
				return (integerN3);
			}
		}
	}

	// 1.c) read number of HTTP Error (400, 401,402, ...) and write the name of
	// this error (Declare enum HTTPError)
	// (Solution methods)
	public static String httpErrorIDCheck(int httpErrorNumber) {
		HTTPError errorName;
		String message = null;
		switch (httpErrorNumber) {
		case 400:
			errorName = HTTPError.BadRequest;
			message = errorName.name();
			break;
		case 401:
			errorName = HTTPError.Unauthorized;
			message = errorName.name();
			break;
		case 402:
			errorName = HTTPError.PaymentRequired;
			message = errorName.name();
			break;
		case 403:
			errorName = HTTPError.Forbidden;
			message = errorName.name();
			break;
		case 404:
			errorName = HTTPError.NotFound;
			message = errorName.name();
			break;
		case 405:
			errorName = HTTPError.MethodNotAllowed;
			message = errorName.name();
			break;
		case 406:
			errorName = HTTPError.NotAcceptable;
			message = errorName.name();
			break;
		case 407:
			errorName = HTTPError.ProxyAuthenticationRequired;
			message = errorName.name();
			break;
		default:
			errorName = null;
			message = "Unknown Error!";
		}
		return message;
	}

}
