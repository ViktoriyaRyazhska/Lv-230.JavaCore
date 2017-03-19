package pack_HomeWork5_2;

public class SalariedEmployee extends Employee implements Calculation {

	private int socialSecurityNumber;
	private double hourly_rate;
	private double number_of_hours_worked;

	public double calculatePay() {
		return this.hourly_rate * this.number_of_hours_worked;
	}

	public SalariedEmployee(String name,String id ,int socialSecurityNumber, double hourly_rate, double number_of_hours_worked) {
		super(name,id);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourly_rate = hourly_rate;
		this.number_of_hours_worked = number_of_hours_worked;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [name=" + super.getName() + " Id; " + super.getEmployeeId() + "];";
	}

}
