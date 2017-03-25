package homework4;

import java.util.Arrays;

//5) Create class Car with fields type, year of production and engine capacity.
//Create and initialize four instances of class Car. Display cars:
//-certain model year  (enter year in the console);
//-ordered by the field year.

public class Car {

	private String type;
	private int yearOfProduction;
	private double engineCapacity;

	static Car[] carList = new Car[0];

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public Car(String type, int yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
		carList = Arrays.copyOf(carList, carList.length + 1);
		carList[carList.length - 1] = this;
	}

	public static void outputByYearOfProd(int year) {
		int numberOfCars = 0;
		for (Car car : carList) {
			if (car.yearOfProduction == year) {
				System.out.println(car);
				numberOfCars++;
			}
		}
		if (numberOfCars == 0) {
			System.out.println("There are no cars of this year of production.");
		}
	}

	public static void sortByYearOfProd() {
		Car tempCar;
		for (int i = 0; i < carList.length - 1; i++) {
			for (int j = i + 1; j < carList.length; j++) {
				if (carList[i].yearOfProduction < carList[j].yearOfProduction) {
					tempCar = carList[i];
					carList[i] = carList[j];
					carList[j] = tempCar;
				}
			}
		}
		for (int i = 0; i < carList.length; i++) {
			System.out.println(carList[i]);
		}
	}

	@Override
	public String toString() {
		return type + " " + yearOfProduction + " " + engineCapacity;
	}
}
