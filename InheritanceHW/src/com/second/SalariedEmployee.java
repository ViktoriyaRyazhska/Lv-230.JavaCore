package com.second;

public class SalariedEmployee extends Employee implements CalculatePay {

	private int hours;
	private int rate;
	private int socialSecurityNumber;

	public SalariedEmployee(String employeeId, String name, int hours, int rate, int socialSecurityNumber) {
		super(employeeId, name);
		this.hours = hours;
		this.rate = rate;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [hours=" + hours + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public Integer getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public int calculatePay() {
		return hours * rate;

	}

}
