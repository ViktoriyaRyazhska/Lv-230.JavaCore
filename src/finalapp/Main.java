package finalapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static List<Employee> list = new ArrayList<Employee>();
	private static Employee employee = new Employee() {
	};
	private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	private static boolean isRun = true;

	public static void main(String[] args) throws IOException {

		while (isRun) {
			System.out.println("Enter 1 to add employee");
			System.out.println("Enter 2 to write employee to file");
			System.out.println("Enter 3 to show all employee");
			System.out.println("Enter 4 to find employee by id");
			System.out.println("Enter 0 to exit");
			switch (bf.readLine()) {
			case "1": {
				System.out.println("Enter 1 to add contract employee");
				System.out.println("Enter 2 to add salaried employee");
				System.out.println("Enter 0 to exit");
				switch (bf.readLine()) {
				case "1": {
					addContractEmployee();
					break;
				}
				case "2": {
					addSalariedEmployee();
					break;
				}
				default:
					break;
				}

				break;
			}
			case "2": {
				employee.writeEmployeeToFile(list, "employee.txt");
				break;
			}
			case "3": {
				employee.showEmployee(list);
				break;
			}
			case "4": {
				System.out.println("Enter employee id: ");
				employee.findEmployeeById(list, Integer.parseInt(bf.readLine()));
				break;
			}

			default:
				isRun = false;
				break;
			}
		}

	}

	public static void addContractEmployee() throws NumberFormatException, IOException {
		System.out.println("Enter employee id: ");
		System.out.println("Enter employee name: ");
		System.out.println("Enter employee federal tax id: ");
		System.out.println("Enter employee fixed paid");
		employee.addEmployee(list, new ContractEmployee(Integer.parseInt(bf.readLine()), bf.readLine(), bf.readLine(),
				Double.parseDouble(bf.readLine())));
	}

	public static void addSalariedEmployee() throws NumberFormatException, IOException {
		System.out.println("Enter employee id: ");
		System.out.println("Enter employee name: ");
		System.out.println("Enter employee social security number: ");
		System.out.println("Enter employee hourly rate: ");
		System.out.println("Enter employee number of hours: ");
		employee.addEmployee(list, new SalariedEmployee(Integer.parseInt(bf.readLine()), bf.readLine(), bf.readLine(),
				Double.parseDouble(bf.readLine()), Double.parseDouble(bf.readLine())));
	}
}
