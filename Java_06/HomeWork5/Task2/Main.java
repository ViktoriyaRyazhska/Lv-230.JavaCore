package pack_HomeWork5_2;

public class Main {

		
	public static void main(String[] args) {

		Calculation EmployeeList[] = new Calculation[4];
		EmployeeList[0] = new SalariedEmployee("Ivanov","IdIvanova", 1245, 23.12, 176);  //4069.12
		EmployeeList[1] = new SalariedEmployee("Petrov","IdPetrova" ,4444, 25.14, 176);  //4424.64
		EmployeeList[2] = new ContractEmployee("Fedorov","IdFedorova", 12313177, 5000);
		EmployeeList[3] = new ContractEmployee("Sidorov","IdSidorova", 98765545, 7000);

		
		int length = EmployeeList.length;
		int i;
		int j;
		int step;
		Calculation tmp = EmployeeList[0];

		for (step = length / 2; step > 0; step /= 2) {
			for (i = step; i < length; i++) {
				tmp = EmployeeList[i];
				for (j = i; j >= step; j -= step) {

					if (tmp.calculatePay() > EmployeeList[j - step].calculatePay()) {
						EmployeeList[j] = EmployeeList[j - step];
					} else {
						break;
					}
				}
				EmployeeList[j] = tmp;
			}
		}

		for (int ii = 0; ii < EmployeeList.length; ii++) {
			System.out.println(
					EmployeeList[ii].toString() + " average monthly salary:" + EmployeeList[ii].calculatePay());
		}

	}
}
