package hom5.task2;

public class Main {

	public static void main(String[] args) {

		Employee[] employees = new Employee[4];
		employees[0] = new ContractEmployee(1, "Vasya", "3123123231", 1200.0);
		employees[1] = new SalariedEmployee(2, "Nazar", "23123123", 20, 15.0);
		employees[2] = new ContractEmployee(3, "Oleg", "65457643523", 900.0);
		employees[3] = new SalariedEmployee(4, "Taras", "124312435", 25, 89.0);
		Employee tmp;

		for (int i = 0; i < employees.length; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (((CalculatePay) employees[i]).calculatePay() < ((CalculatePay) employees[j]).calculatePay()) {
					tmp = employees[i];
					employees[i] = employees[j];
					employees[j] = tmp;
				}
			}
		}
		for (Employee emp : employees) {
			System.out.println(emp);
		}

	}

}
