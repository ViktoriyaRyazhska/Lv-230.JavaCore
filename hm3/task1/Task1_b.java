import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by forest on 12.03.2017.
 */
public class Task1_b {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[3];
        for(int i=0; i<array.length; i++){
            array[i]=Integer.parseInt(bufferedReader.readLine());
        }

        int min = array[0];
        for(int a:array){
            if(min>a) min=a;
        }

        System.out.println(min);
    }
}
