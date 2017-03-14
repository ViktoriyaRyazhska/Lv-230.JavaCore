package com.fifth;

public class Car {

	private String type;
	private int year;
	private int engineCapacity;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String type, int year, int engineCapacity) {
		super();
		this.type = type;
		this.year = year;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", engineCapacity=" + engineCapacity + "]";
	}
	
	
}
