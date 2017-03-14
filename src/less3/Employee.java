package less3;

public class Employee {
	
	private String name;
	private double rate;
	private double hours;
	private static double totalSum;
	private static double totalHours;

	public Employee() {

	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalHours += hours;

	}

	public void salary() {
		double sal = this.rate * this.hours;
		totalSum += sal;
		System.out.println("Salary" + sal);
	}

	public void bonuses() {
		double bonus = (((this.rate * this.hours) * 0.1) / 0.01);
		System.out.println("Bonus: " + bonus);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
		totalHours += hours;
	}

	public static double getTotalSum() {
		return totalSum;
	}

	public static double getTotalHours() {
		return totalHours;
	}

	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

}
