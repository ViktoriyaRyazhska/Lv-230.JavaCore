
public class Cleaner extends Staff {
	public static final String TYPE_PERSON = "Cleaner";
	private int hoursWorked;
	private int hourlyWage;
	
	public Cleaner(String name, int hoursWorked,int hourlyWage) {
		super(name);
		System.out.println(Cleaner.TYPE_PERSON);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
		setHourlyWage(hourlyWage);
	    setHoursWorked(hoursWorked);
		
	}

public int getHoursWorked(){
	return hoursWorked;
}
public void setHoursWorked(int hoursWorked){
	this.hoursWorked = hoursWorked;
}

public int getHourlyWage(){
	return hourlyWage;
}
public void setHourlyWage(int hourlyWage){
	this.hourlyWage = hourlyWage;
}

	
	@Override
	public   int salary() {
		
		return getHourlyWage() * getHoursWorked();
	}

	@Override
	public void print() {
		System.out.println("I am a " + Cleaner.TYPE_PERSON);
		
	}

	@Override
	public String toString(){
		return "Name is " + getName() + " " + "hours worked - " + getHoursWorked() + " " + "hourlyWage is  " + getHourlyWage() + "$" ;
		
	}




}
