package hom5.task2;

public class ContractEmployee extends Employee implements CalculatePay {

	private String federalTaxIdMember;
	private double fixedPay;

	public ContractEmployee(int employeeid, String name, String federalTaxIdMember, double fixedPay) {
		super(employeeid, name);
		this.federalTaxIdMember = federalTaxIdMember;
		this.fixedPay = fixedPay;
	}

	@Override
	public double calculatePay() {
		return fixedPay;
	}

	public String getFederalTaxIdMember() {
		return federalTaxIdMember;
	}

	public void setFederalTaxIdMember(String federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}

	public double getFixedPay() {
		return fixedPay;
	}

	public void setFixedPay(double fixedPay) {
		this.fixedPay = fixedPay;
	}

	@Override
	public String toString() {
		return "ContractEmployee [calculatePay()=" + calculatePay() + ", toString()=" + super.toString() + "]";
	}

}
