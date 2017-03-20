package com.home;

/**
 * Created by kitty on 3/20/17.
 */
public class Fixed_paid_workers extends SalariedEmployee {

    Integer fixed_monthly_payment;

    @Override
    public Integer calculatePay() {
        return average_monthly_salary;
    }

    public Fixed_paid_workers (String name, Integer fixed_monthly_payment, Integer employeeId){
        this.name = name;
        this.employeeId = employeeId;
        this.fixed_monthly_payment = fixed_monthly_payment;
        average_monthly_salary = fixed_monthly_payment;
    }

}