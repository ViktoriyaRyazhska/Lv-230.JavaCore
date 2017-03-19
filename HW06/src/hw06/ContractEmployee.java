package hw06;

public class ContractEmployee extends Employee implements Pay{
	
	private double monthPay;
	private String federalTaxIdmember;
	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	@Override
	public String toString() {
		return "ContractEmployee [monthPay=" + monthPay + ", ID" + getEmployeeld() + ", federalTaxIdmember=" + federalTaxIdmember + "]";
	}
	public double getMonthPay() {
		return monthPay;
	}
	public void setMonthPay(double monthPay) {
		this.monthPay = monthPay;
	}

	@Override
	public double calculatePay() {
		return monthPay;
	}
}
