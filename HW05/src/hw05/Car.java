package hw05;

public class Car {
	private TypeOfCar typeOfCar;
	private int year;
	private double engine;
	
	public Car(TypeOfCar typeOfCar, int year, double engine) {
		this.typeOfCar = typeOfCar;
		this.year = year;
		this.engine = engine;
	}
	
	public TypeOfCar getTypeOfCar() {
		return typeOfCar;
	}
	public int getYear() {
		return year;
	}
	public double getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car [typeOfCar=" + typeOfCar + ", year=" + year + ", engine=" + engine + "]";
	}
	
}
