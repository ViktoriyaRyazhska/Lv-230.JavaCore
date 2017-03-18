public class Main {
    public static void main(String[] args) {
        Employee[] arrOfEmpl = new Employee[4];
        arrOfEmpl[0] = new ContractEmployee("Contract employee", "Bob", 1000, "045205");
        arrOfEmpl[1] = new SalariedEmployee("Salaried employee", "Rick", 30, 25, "8545235");
        arrOfEmpl[2] = new ContractEmployee("Contract employee", "Tom", 1200, "031206");
        arrOfEmpl[3] = new SalariedEmployee("Salaried employee", "Steve", 35, 120, "8245136");

        showAllEmployee(arrOfEmpl);
        orderByMonthlySalary(arrOfEmpl);
    }

    public static void orderByMonthlySalary(Employee[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                Employee tempEmpl;
                if( ((CalculatePayment)array[i]).calculatePay() > ((CalculatePayment)array[j]).calculatePay() ){
                    tempEmpl = array[i];
                    array[i] = array[j];
                    array[j] = tempEmpl;
                }
            }
        }


        for(Employee emp:array){
            if(emp instanceof ContractEmployee){
                System.out.println("Federal Tax ID member: "+((ContractEmployee) emp).getFederalTaxIdmember() +
                        ", Name is: "+emp.getName()+", monthly salary = "+((ContractEmployee) emp).calculatePay()+"$");
            }
            if(emp instanceof SalariedEmployee){
                System.out.println("Social Security Number: "+((SalariedEmployee) emp).getSocialSecurityNumber() +
                        ", Name is: "+emp.getName()+", monthly salary = "+((SalariedEmployee) emp).calculatePay()+"$");
            }
        }
        System.out.println();
    }
    public static void showAllEmployee(Employee[] array){
        for(Employee emp:array){
            System.out.println(emp);
        }
        System.out.println();
    }
}
