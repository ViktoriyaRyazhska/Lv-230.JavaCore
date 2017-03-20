package week3.thursday.homework.task2;

/**
 * Create class ContractEmployee,
 * which implement interface and are inherited from the base class (modified).
 * Describe fixed paid workers.
 * Include a description of federalTaxIdmember in the class of contractEmployee.
 */
public class ContractEmployee extends Employee { // implemented interface into Employee
    public static final int FIXED_PAY = 100;
    private String federalTaxIdMember;

    public ContractEmployee(String name, String federalTaxIdMember) {
        super(name);
        setFederalTaxIdMember(federalTaxIdMember);
    }

    @Override
    public int calculatePay() {
        return FIXED_PAY;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }
}
