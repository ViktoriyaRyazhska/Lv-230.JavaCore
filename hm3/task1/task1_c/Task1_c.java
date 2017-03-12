import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by forest on 12.03.2017.
 */
public class Task1_c {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int httpError = Integer.parseInt(bufferedReader.readLine());

        switch (httpError){
            case 400:
                System.out.println(HttpError.BAD_REQUEST);
                break;
            case 401:
                System.out.println(HttpError.UNAUTHORIZED);
                break;
            case 402:
                System.out.println(HttpError.PAYMENT_REQUIRED);
                break;
            case 403:
                System.out.println(HttpError.FORBIDDEN);
                break;
            case 404:
                System.out.println(HttpError.NOT_FOUND);
                break;
                default:
                    System.out.println("unknown error".toUpperCase());
                    break;
        }
    }
}
