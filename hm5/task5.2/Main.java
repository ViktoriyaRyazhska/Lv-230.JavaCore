
public class Main {

	public static void main(String[] args) {
		
		Employee[] array = new Employee[4];
		array[0] = new SalariedEmployee("SalariedEmployee",50,"Jack", 13539, 65);
		array[1] = new SalariedEmployee("SalariedEmployee",60,"Andrew", 17339, 78);
		array[2] = new ContractEmployee("ContractEmployee",750, "Lenda", "83213");
		array[3] = new ContractEmployee("ContractEmployee",940, "Qwimby", "325724");

	for(Employee a: array){
		System.out.println(a);
		
	}
	
	


	        for(Employee empl:array){
	            if(empl instanceof ContractEmployee){
	                System.out.println("Federal Tax ID member: "+((ContractEmployee) empl).getFederalTaxIdmember() +
	                        ", Name is: "+empl.getName()+", monthly salary = "+((ContractEmployee) empl).calculatePay()+"$");
	            }
	            if(empl instanceof SalariedEmployee){
	                System.out.println("Social Security Number: "+((SalariedEmployee) empl).getSocialSecurityNumber() +
	                        ", Name is: "+empl.getName()+", monthly salary = "+((SalariedEmployee) empl).calculatePay()+"$");
	            }
	        }
	        System.out.println();
	    }
	
	
	}


