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

public class SalariedEmployee extends Employee implements CalculatePayment {
	
	private String socialSecurityNumber;
	private double fixedMonthlyPayment;

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}
	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	
	public SalariedEmployee(String employeeID, String name, String socialSecurityNumber, int fixedMonthlyPayment) {
		super(employeeID, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	
	@Override
	public double calculatePay() {
		return fixedMonthlyPayment;
	}

}
