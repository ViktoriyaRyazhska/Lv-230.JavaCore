package finalapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class Employee {
	private int employeeid;
	private String name;

	public Employee() {
	}

	public Employee(int employeeid, String name) {
		this.employeeid = employeeid;
		this.name = name;
	}

	public void showEmployee(List<Employee> employees) {
		for (Employee emp : employees) {
			System.out.println(emp);
		}

	}

	public void findEmployeeById(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getEmployeeid()) {
				System.out.println(list.get(i));
			}
		}
	}

	public void removeEmployeeById(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getEmployeeid()) {
				list.remove(i);
			}
		}
	}

	public List<Employee> addEmployee(List<Employee> list, Employee employee) {
		list.add(employee);
		return list;

	}

	public void writeEmployeeToFile(List<Employee> employees, String filename) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
		for (int i = 0; i < employees.size(); i++) {
			bw.write(employees.get(i).toString());
		}
		bw.close();

	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + "]";
	}

}
