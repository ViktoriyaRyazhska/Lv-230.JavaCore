package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by forest on 22.03.2017.
 */
public class PracticalTask2 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bob");
        map.put(2, "Jack");
        map.put(3, "Tom");
        map.put(4, "Rick");

        show(map);
        findByID(map);

    }
    public static void show(Map<Integer, String> map){
        for(Map.Entry<Integer, String> entry:map.entrySet()){
            Integer id = entry.getKey();
            String name = entry.getValue();
            System.out.println(id+" - "+name);
        }
    }
    public static void findByID(Map<Integer, String> map) throws IOException {
        System.out.println("Enter id pls");
        String nameInp = reader.readLine();
        for(Map.Entry<Integer, String> entry:map.entrySet()){
//            Integer id = entry.getKey();
            //String name = entry.getValue();
            if(map.containsValue(nameInp)){
                map.g
            }//else System.out.println("can't find");
        }
        System.out.println();
    }
}
