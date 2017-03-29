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

public class Employee  {
	
	private String employeeID;
	private String name;
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee(String employeeID, String name) {
		this.employeeID = employeeID;
		this.name = name;
	}
	
	public static void sortEmployeeDescAverMonthlyWage(Employee[] employeeArray){
		Employee tempEmpl;
		for (int i = 0; i < employeeArray.length - 1; i++) {
			for (int j = i + 1; j <employeeArray.length; j++) {
				if (((CalculatePayment) employeeArray[i]).calculatePay() < ((CalculatePayment) employeeArray[j]).calculatePay()) {
					tempEmpl = employeeArray[i];
					employeeArray[i] = employeeArray[j];
					employeeArray[j] = tempEmpl;
				}
			}
		}
	}
	@Override
	public String toString() {
		return "EmployeeID: " + employeeID + "	" + "Name: " + name +  "	" + "Average monthly wage: " + ((CalculatePayment) this).calculatePay();
	}
	
	
}
