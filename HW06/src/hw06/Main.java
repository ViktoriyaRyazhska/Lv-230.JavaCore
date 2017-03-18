package hw06;

public class Main {

	public static void main(String[] args) {

//		Bird[] birds = new Bird[4];
//		
//		birds[0] = new Penguin();
//		birds[1] = new Chicken();
//		birds[2] = new Eagle();
//		birds[3] = new Swallow();
//		for (Bird bird : birds) {
//			bird.fly();
//		}
//		for (Bird bird : birds) {
//			if(bird instanceof NonFlyingBird){
//				bird.setLayEggs(true);
//			}else{
//				bird.setLayEggs(false);
//			}
//			bird.setFeathers(true);
//			System.out.println(bird);
//		}
		
// Tesk 2
		Employee[]ems = new Employee[2];
		ems[0] = new SalariedEmployee();
		ems[0].setEmployeeld("1");
		if(ems[0] instanceof SalariedEmployee){
			((SalariedEmployee) ems[0]).setHours(12);
			((SalariedEmployee) ems[0]).setSalary(150.9);
			((SalariedEmployee) ems[0]).setSocialSecurityNumber("111");
			((SalariedEmployee) ems[0]).calculatePay();
		}
		ems[1] = new ContractEmployee();
		ems[1].setEmployeeld("2");
		if(ems[1] instanceof ContractEmployee){
			((ContractEmployee) ems[1]).setMonthPay(10000);
			((ContractEmployee) ems[1]).setFederalTaxIdmember("222");
			((ContractEmployee) ems[1]).calculatePay();
		}
		for (Employee employee : ems) {
			System.out.println(employee);
		}
	}

}
