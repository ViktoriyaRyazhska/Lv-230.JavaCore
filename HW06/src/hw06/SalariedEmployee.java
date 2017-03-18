package hw06;

public class SalariedEmployee extends Employee implements Pay{
	
	private int hours;
	private double salary;
	private String socialSecurityNumber;
	
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public void calculatePay() {
			System.out.println("monthly salary "+hours * salary);
	}
	@Override
	public String toString() {
		return "SalariedEmployee [hours=" + hours + ", salary=" + salary + ", socialSecurityNumber="
				+ socialSecurityNumber + "]";
	}

}
