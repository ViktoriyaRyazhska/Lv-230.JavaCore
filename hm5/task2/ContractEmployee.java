public class ContractEmployee extends Employee implements CalculatePayment {
    private String federalTaxIdmember;

    public ContractEmployee(String employeed, String name, int salary, String federalTaxIdmember) {
        super(employeed, name, salary);
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public int calculatePay() {
        // here field salary = salary for 1 month (fixed)
        return getSalary();
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public String toString() {
        return "Name is: "+getName()+", salary for 1 months = "+getSalary()+"$"+", federal tax ID member is: "+getFederalTaxIdmember();

    }
}
