package com.home;

/**
 * Created by kitty on 3/20/17.
 */
public class SalariedEmployee extends Employee implements Interface {

    String socialSecurityNumber;


    @Override
    public Integer calculatePay() {
        return average_monthly_salary;
    }
}
