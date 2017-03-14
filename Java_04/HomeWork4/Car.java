package packHW4;

public class Car {
	String name;
	int year;
	int capacity;
	
	public Car(String name, int year, int capacity) {
		super();
		this.name = name;
		this.year = year;
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}
