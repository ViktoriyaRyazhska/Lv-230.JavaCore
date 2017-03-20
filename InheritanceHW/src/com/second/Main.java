package com.second;

public class Main {
	public static void main(String[] args) {
		Employee[] e = new Employee[4];
		e[0] = new SalariedEmployee("Salaried", "Roman", 170, 5, 34546);
		e[1] = new SalariedEmployee("Salaried", "Ivan", 150, 10, 4564);
		e[2] = new ContractEmployee("Contract", "Yura", 100, 1000);
		e[3] = new ContractEmployee("Contract", "Kolya", 200, 1300);

		showEmploees(e);
		orderBySalary(e);

	}

	public static void showEmploees(Employee[] arr) {
		for (Employee employee : arr) {
			System.out.println(employee + " ");
		}
		System.out.println();
	}

	public static void orderBySalary(Employee[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				Employee tmpEmpl;
				if (((CalculatePay) arr[i]).calculatePay() > ((CalculatePay) arr[j]).calculatePay()) {
					tmpEmpl = arr[i];
					arr[i] = arr[j];
					arr[j] = tmpEmpl;
				}
			}
		}
		for (Employee employee : arr) {
			if (employee.getEmployeeId().equals("Salaried")) {
				System.out.println("Name is " + employee.getName() + " social security number = "
						+ ((SalariedEmployee) employee).getSocialSecurityNumber() + " salary = "
						+ ((SalariedEmployee) employee).calculatePay());
			} else {
				System.out.println("Name is " + employee.getName() + " federal tax id member "
						+ ((ContractEmployee) employee).getFederalTaxIdmember() + " salary = "
						+ ((ContractEmployee) employee).calculatePay());
			}
		}
	}

}
