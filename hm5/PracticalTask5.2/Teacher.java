
public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";
	private int hoursWorked;
	private int hourlyWage;
	
	public Teacher(String name, int hoursWorked, int hourlyWage) {
		super(name);
		System.out.println(Teacher.TYPE_PERSON);
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
		    public int salary() {
		        return getHourlyWage() * getHoursWorked();
		    }

	 @Override
		public void print() {
			System.out.println("I am a " + Teacher.TYPE_PERSON);
			
		}

	 @Override
		public String toString(){
			return "Name is " + getName() + " " + "hours worked - " + getHoursWorked() + " " + "hourlyWage is  " + getHourlyWage() + "$" ;
			
		}







}
