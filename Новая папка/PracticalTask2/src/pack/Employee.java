package pack;

public class Employee {
	private String name;
	private double hours;
	private double rate;
	
	private static double totalhours;
	private static double totalsum;
	
	public Employee(){
		
	}
	
	
	public Employee(String name, double rate) {
		super();
		this.name = name;
		this.rate = rate;
	}
	
		
	public Employee(String name, double hours, double rate) {
		super();
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		totalhours+=hours;
	}

    public double Salary(){
    	return rate*hours;
    }
    
    public double Bonuses(){
    	return Salary()*10/100;
    }

    public void ChangeRate(double rate){
       	this.rate = rate;
        }


	@Override
	public String toString() {
		return "Employee [name=" + name + ", hours=" + hours + ", rate=" + rate + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
		totalhours+=hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
		}
	
		
	public static double gethours(){
		return totalhours;
	}
}
