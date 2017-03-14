import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int[] arrDayOfMonth = {31, 28, 31, 30, 31, 30,
                                     31, 31, 30, 31, 30, 31};
        System.out.println("Pls enter the number of month");
        int temp = Integer.parseInt(bufferedReader.readLine())-1;
        if(temp < 0 || temp > 11){
            System.out.println("wrong input");
        }else System.out.println(arrDayOfMonth[temp]);
    }
}
