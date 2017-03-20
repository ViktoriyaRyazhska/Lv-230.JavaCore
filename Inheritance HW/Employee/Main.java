package com.home;

public class Main {

    public static void main(String[] args) {
        Employee arr[] = new Employee[5];
        arr[0]= new Hourly_paid_workers("Vasya", 3456, 148, 50);
        arr[1]= new ContractEmployee("Sasha", 4545);
        arr[2]= new Fixed_paid_workers("Masha", 8222, 5700);
        arr[3]= new Hourly_paid_workers("Sofia", 3125, 165, 75);
        arr[4]= new ContractEmployee("Sergio", 5467);

        Integer i;
        Employee tmp;
        Integer j;

        for(i=0; i<arr.length-1; ++i){
            for(j=i+1; j<arr.length; ++j){
                if (arr[i].getAverageSalary()< arr[j].getAverageSalary()){
                    tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= tmp;
                }
            }
        }

        for(i=0; i< arr.length; ++i){
            System.out.println("Name is " + arr[i].getName() + " ID is " + arr[i].getEmployeeId() + " Average monthly wage is " + arr[i].getAverageSalary());
        }

        // write your code here
    }
}
