import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Car[] arrayOfCars = new Car[4];
        arrayOfCars[0] = new Car("Toyota", 1995, 300);
        arrayOfCars[1] = new Car("Chevrolet", 1967, 600);
        arrayOfCars[2] = new Car("Ford", 2004, 400);
        arrayOfCars[3] = new Car("Ferrari", 2013, 500);

        for (Car a:arrayOfCars){
            System.out.println(a);
        }

        orderByYear(arrayOfCars);

        System.out.println();
        for (Car a:arrayOfCars){
            System.out.println(a);
        }

        System.out.println();
        showCarByYear(arrayOfCars);


    }
    public static void orderByYear(Car[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                Car temp;
                if(array[i].getYearOFProduction()>array[j].getYearOFProduction()){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void showCarByYear(Car[] array) throws IOException {
        System.out.println("Pls enter year of car which u want");
        int inputCarYear = Integer.parseInt(bufferedReader.readLine());
        for(Car c:array){
            if(inputCarYear==c.getYearOFProduction()){
                System.out.println(c);
                break;
            } else{
                System.out.println("Car with this year doesn't exist");
                break;
            }
        }
    }
}
