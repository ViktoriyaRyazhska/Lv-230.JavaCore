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


public class HomeWork5EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] employeeArray = new Employee[5];
		
		employeeArray[0] = new SalariedEmployee("IDS001", "Anna", "AB7777777", 18000);
		employeeArray[1] = new SalariedEmployee("IDS002", "Borys", "BV3333333", 15000);
		employeeArray[2] = new SalariedEmployee("IDS003", "Alex", "AV5555555", 17000);
		employeeArray[3] = new ContractEmployee ("IDC001", "Iryna", "8888888", 400, 40);
		employeeArray[4] = new ContractEmployee ("IDC002", "Denys", "9999999", 300, 20);
		
		Employee.sortEmployeeDescAverMonthlyWage(employeeArray);
		
		for (int i=0; i<employeeArray.length; i++){
			System.out.println(employeeArray[i]);
		}
		
	}

}
