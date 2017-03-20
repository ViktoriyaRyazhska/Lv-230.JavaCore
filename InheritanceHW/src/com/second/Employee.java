package com.second;

public abstract class Employee {

	private String employeeId;
	private String name;

	public Employee(String employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
