package less3;

public class Employee {
	
	public static int totalSum = 0;
	private String name;
	private int hours;
	private double rate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		totalSum -= salary();
		this.hours = hours;
		totalSum += salary();
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		totalSum -= salary();
		this.rate = rate;
		totalSum += salary();
	}
	public Employee(String name, int hours, double rate) {
		totalSum -= salary();
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		totalSum += salary();
	}
	public Employee(String name, double rate) {
		totalSum -= salary();
		this.name = name;
		this.rate = rate;
		totalSum+=salary();
	}
	
	public Employee() {
		totalSum -= salary();

		totalSum+=salary();
	}
	
	public double salary(){
		return rate*hours;
		
	}
	
	public void changeRate(double rate){
		totalSum -= salary();
		this.rate = rate;
		totalSum += salary();
	}
	
	public double bonuses() {
		double bonus = salary()*10/100;
		return bonus;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", hours=" + hours + ", rate=" + rate + ", salary()=" + salary()
				+ ", bonuses()=" + bonuses() + "]";
	}
	
	

	
}
