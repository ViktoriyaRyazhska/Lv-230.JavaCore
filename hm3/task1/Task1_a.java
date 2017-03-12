import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by forest on 12.03.2017.
 */
public class Task1_a {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<3; i++){
            float f = Float.parseFloat(bufferedReader.readLine());
//            if(f>-5 && f<5){
//                System.out.println(f+" belong to the range [-5,5]");
//            }else System.out.println("this number don't belong to the range [-5,5]");

            String s = f>-5 && f<5 ? f+" belong to the range [-5,5]" : "this number don't belong to the range [-5,5]";
            System.out.println(s);
        }
    }
}
