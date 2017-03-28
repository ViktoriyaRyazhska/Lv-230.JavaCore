package temp.hm8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter number: ");
            System.out.println(readNumber(Integer.parseInt(r.readLine())));
        }catch (IOException e){
            System.out.println("Wrong input");
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());}
    }
    public static int readNumber(int numb) throws IOException, NumberFormatException{
        if(numb < 0) throw  new ArithmeticException("negative number");
        return numb > 1 && numb < 100 ? numb : -1;
    }
}
