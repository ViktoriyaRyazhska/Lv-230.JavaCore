import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (Integer.parseInt(bufferedReader.readLine())>0){
            count++;
        }
        System.out.println(count);
    }
}
