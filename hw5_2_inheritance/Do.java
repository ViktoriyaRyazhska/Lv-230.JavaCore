package hw5_2;

public class Do {
	
	public static void main(String[] args) {
        Employee[] arr = new Employee[4];
        arr[0] = new ContractEmployee("CE","Ihor","A9099090F",3500);
        arr[1] = new SalariedEmployee("SE","Olga","06464667",200,20);
        arr[2] = new ContractEmployee("CE","Andryi","B878787878J",5000);
        arr[3] = new SalariedEmployee("SE","Ivan","65464666",250,15);

        showAll(arr);
        orderBySalary(arr);
    }

    public static void orderBySalary(Employee[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                Employee tempEmpl;
                if( ((Payment)array[i]).calculatePay() > ((Payment)array[j]).calculatePay() ){
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
    public static void showAll(Employee[] array){
        for(Employee emp:array){
            System.out.println(emp);
        }
        System.out.println();
    }
	
}
