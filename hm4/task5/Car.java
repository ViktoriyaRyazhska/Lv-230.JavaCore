
public class Car {

	private String type;
	private int yearOfProduction;
	private int engineCapacity;
	
	
	  public Car(String type, int yearOFProduction, int engineCapacity) {
	        this.type = type;
	        this.yearOfProduction = yearOFProduction;
	        this.engineCapacity = engineCapacity;
	    }

	    public String getType() {
	        return type;
	    }

	    public int getYearOfProduction() {
	        return yearOfProduction;
	    }

	    public int getEngineCapacity() {
	        return engineCapacity;
	    }

	    @Override
	    public String toString() {
	        return  "Name is "+type+", year of production "+yearOfProduction+", engine capacity = "+engineCapacity;
	    }
	}
	
	

