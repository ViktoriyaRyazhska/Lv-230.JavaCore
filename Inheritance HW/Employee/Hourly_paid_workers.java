package com.home;

/**
 * Created by kitty on 3/20/17.
 */
public class Hourly_paid_workers extends SalariedEmployee {


    @Override
    public Integer calculatePay() {
        return average_monthly_salary;
    }

    public Hourly_paid_workers(String name, Integer employeeId, Integer nunumber_of_hours_worked, Integer hourly_rate){
        this.name = name;
        this.employeeId = employeeId;
        this.hourly_rate = hourly_rate;
        this.number_of_hours_worked = nunumber_of_hours_worked;
        average_monthly_salary = hourly_rate*number_of_hours_worked;
    }


}
