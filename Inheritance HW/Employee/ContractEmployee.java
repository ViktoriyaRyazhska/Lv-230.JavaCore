package com.home;

/**
 * Created by kitty on 3/20/17.
 */
public class ContractEmployee extends Employee implements Interface {

    String federalTaxIdmember;

    public ContractEmployee (String name, Integer employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public Integer calculatePay() {
        return 0;
    }
}

