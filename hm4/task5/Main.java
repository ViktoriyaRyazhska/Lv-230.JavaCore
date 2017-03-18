import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) 	{
		
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 
Car[] arrayOfCars = new Car[4];
arrayOfCars[0] = new Car("BMW", 2008, 350);
arrayOfCars[1] = new Car("Mersedes", 2012, 400);
arrayOfCars[2] = new Car("Lamborgini", 2017, 700);
arrayOfCars[3] = new Car("Audi", 2015, 500);

}

	public static void showCarByYear(Car[] arrayOfCars)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter year of car which you want");
	int a = Integer.parseInt(br.readLine());
	for(Car c:arrayOfCars){
	if(c.getYearOfProduction()==a){
		System.out.println("Type of car is " + c.getType() + "Engine capacity is " + c.getEngineCapacity() + " and year of production is  " + c.getYearOfProduction());
	break;
	}
		else{
			System.out.println("Car with tis year production we dont have");
			break;
		}
	
		
	}
	
	
	
	}
	
	}




