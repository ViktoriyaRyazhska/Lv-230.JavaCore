package homework5Employee;

//Create an interface to the method calculatePay(), the base class Employee with a string variable employeeId. 
//Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class. 
//Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child). 
//Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//Include a description of federalTaxIdmember in the class of contractEmployee .
//The calculation formula for the "time-worker“ is: "the average monthly salary = hourly rate * number of hours worked".
//For employees with a fixed payment the formula is: "the average monthly salary = fixed monthly payment“.
//Create an array of employees and add the employees with different form of payment.
//Arrange the entire sequence of workers descending the average monthly wage.
//Output the employee ID, name, and the average monthly wage for all elements of the list.

public class ContractEmployee extends Employee implements CalculatePayment {

	private String federalTaxIdmember;
	private double hourlyRate;
	private double numberOfHoursWorked;
	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(double numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public ContractEmployee(String employeeID, String name, String federalTaxIdmember, double hourlyRate, double numberOfHoursWorked) {
		super(employeeID, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	@Override
	public double calculatePay() {
		return hourlyRate * numberOfHoursWorked;
		
	}

}
