package finalapp;

public class SalariedEmployee extends Employee implements CalculatePay {
	private String socialSecurityNumber;
	private double hourlyRate;
	private double numberOfHours;

	public SalariedEmployee(int employeeid, String name, String socialSecurityNumber, double hourlyRate,
			double numberOfHours) {
		super(employeeid, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.numberOfHours = numberOfHours;
	}

	@Override
	public double calculatePay() {
		return hourlyRate * numberOfHours;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(double numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [Pay()=" + calculatePay() + ", SocialSecurityNumber=" + getSocialSecurityNumber()
				+ ", " + super.toString() + "]";
	}

}
