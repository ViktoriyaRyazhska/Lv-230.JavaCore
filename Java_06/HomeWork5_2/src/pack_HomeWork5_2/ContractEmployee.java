package pack_HomeWork5_2;

public class ContractEmployee extends Employee implements Calculation {

	private int federalTaxIdmember;
	private double fixed_monthly_payment;

	public double calculatePay() {
		return this.fixed_monthly_payment;
	}

	public ContractEmployee(String name, String id,int federalTaxIdmember, double fixed_monthly_payment) {
		super(name,id);

		this.federalTaxIdmember = federalTaxIdmember;
		this.fixed_monthly_payment = fixed_monthly_payment;
	}

	@Override
	public String toString() {
		return "ContractEmployee [name=" + super.getName() + "; Id " + super.getEmployeeId() + "];";
	}

}
