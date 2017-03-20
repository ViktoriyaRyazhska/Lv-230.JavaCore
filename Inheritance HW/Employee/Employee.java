package com.home;

/**
 * Created by kitty on 3/20/17.
 */
public class Employee {
    public Integer employeeId;
    public String name;

    Integer average_monthly_salary =0;
    protected Integer hourly_rate;
    Integer number_of_hours_worked;

    Integer getRate(){
        return  this.hourly_rate;
    }

    Integer getAverageSalary(){
        return average_monthly_salary;
    }

    String getName(){
        return name;
    }
    Integer getEmployeeId(){
        return employeeId;
    }

}
