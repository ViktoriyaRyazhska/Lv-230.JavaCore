package hw4;

import java.util.Scanner;



public class Car {
	private String type;
	private int year;
	private int engine_capacity;
	Car(){}
	public Car(String type, int year, int engine_capacity){
		this.type = type;
		this.year = year;
		this.engine_capacity = engine_capacity;
	}
	
	public String getType() {
		return type;
	}

	public void setName(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int geteEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(int engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	@Override
	public String toString() {
	return "Car [type=" + type + ", year=" + year + ", engine_capacity=" +engine_capacity +"]";
	}

}

class Do{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		Car car[] = {new Car("sedan", 2000, 2000), 
		          new Car("convertable", 2008, 3000),
		          new Car("pick-up", 1995, 5000)
		          };
		Car tmp;
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYear() < car[j].getYear()) {
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		
		for (int i = 0; i < car.length; i++) {
			if(sc.nextInt()==car[i].getYear())
			System.out.println(car[i]);
		}
		
		System.out.println("¬вед≥ть номер м≥с€ц€");
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println(days[sc.nextInt()-1]);
		
		int[] arr = {2,4,5,6,-8,5,7,-9,1,9};
		int sum=0, prod=1, k=0, min = arr[0], imin=0;
		for (int i = 0; i<5; i++){
			sum+=arr[i];
			prod*=arr[i+5];
			if(arr[i]>0) k++;
			if (k == 2) System.out.println("≤ндекс 2 позитивного елемента = " + i);
			if (arr[i]<min){
				min = arr[i];
				imin = i;
				}
		}
		if(sum > 0 || prod > 0) System.out.println("юху");
		System.out.println("≤ндекс м≥н≥мального елемента = " + imin + arr[imin]);
		
		
		sc.close();
	}
}
