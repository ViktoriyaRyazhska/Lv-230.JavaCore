package hom4;

public class Car {
	private String type;
	private int yearOfProdaction;
	private int engineCapacity;

	Car() {

	}

	public Car(String type, int yearOfProdaction, int engineCapacity) {
		super();
		this.type = type;
		this.yearOfProdaction = yearOfProdaction;
		this.engineCapacity = engineCapacity;
	}

	public void orderedByYear(Car[] cars) {
		Car car = cars[0];
		for (int i = 0; i < cars.length; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYearOfProdaction() > cars[j].getYearOfProdaction()) {
					car = cars[i];
					cars[i]=cars[j];
					cars[j] = car;
					
				}
			}
			System.out.println(cars[i]);
		}
	}

	public void findByYear(Car[] cars, int numb) {
		for (int i = 0; i < cars.length; i++) {
			if (numb == cars[i].getYearOfProdaction()) {
				System.out.println(cars[i]);
			}
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProdaction() {
		return yearOfProdaction;
	}

	public void setYearOfProdaction(int yearOfProdaction) {
		this.yearOfProdaction = yearOfProdaction;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + engineCapacity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + yearOfProdaction;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engineCapacity != other.engineCapacity)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (yearOfProdaction != other.yearOfProdaction)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProdaction=" + yearOfProdaction + ", engineCapacity=" + engineCapacity
				+ "]";
	}

}
