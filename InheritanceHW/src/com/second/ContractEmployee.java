package com.second;

public class ContractEmployee extends Employee implements CalculatePay {

	private int federalTaxIdmember;
	private int fixedMonthlyPayment;

	public ContractEmployee(String employeeId, String name, int federalTaxIdmember, int fixedMonthlyPayment) {
		super(employeeId, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;

	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", fixedMonthlyPayment="
				+ fixedMonthlyPayment + "]";
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public int calculatePay() {
		return fixedMonthlyPayment;
	}

}
