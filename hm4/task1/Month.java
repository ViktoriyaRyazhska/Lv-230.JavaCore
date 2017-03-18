import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int month_days[ ]  = new int[13];
		month_days[1] = 31;
		month_days[2] = 28;
		month_days[3] = 31;
		month_days[4] = 30;
		month_days[5] = 31;
		month_days[6] = 30;
		month_days[7] = 31;
		month_days[8] = 31;
		month_days[9] = 30;
		month_days[10] = 31;
		month_days[11] = 30;
		month_days[12] = 31;
		System.out.println("Enter number of month to know ammount of days");
		int a = Integer.parseInt(br.readLine());
		if(a < 0 || a > 12){
            System.out.println("There*s only 12 month.Please write properly!");
        }else System.out.println(month_days[a]);
    }
		

	}


