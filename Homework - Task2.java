import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Calls {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String country;

double price1 = 1, price2 = 1.5, price3 = 2.5 ;
double money = 0;
double time = 0;




System.out.println("1 minute of call to Germany cost  " + price1 + " dollars " + " ,to Italia " + price2 + " dollars" + " ,to France " + price3 + " dollars!");
System.out.println("Please enter country in which your want to call - 1)Germany 2)Italia 3)France");
country = br.readLine();

System.out.println("Please insert money ");
money = Integer.parseInt(br.readLine());
 
if(country.equals("Germany") )
{
	time = money/price1; 
}

 if(country.equals("Italia")){
	time = money/price2;
}
 if(country.equals("France")){
	time = money/price3;
}


System.out.println("Your call to " + country +  " will last " + time + " minutes");

	
	
	}

}