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
        findByName(map);

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
        Integer id = Integer.parseInt(reader.readLine());
        if(map.containsKey(id)) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if(entry.getKey().equals(id)){
                    System.out.println(entry.getValue()+" - "+entry.getKey());
                }
            }
        }else System.out.println("can't find this Name ");
        System.out.println();
    }
    public static void findByName(Map<Integer, String> map) throws IOException {
        System.out.println("Enter name pls");
        String nameInp = reader.readLine();
        if(map.containsValue(nameInp)) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if(entry.getValue().equals(nameInp)){
                    System.out.println(entry.getValue()+" "+entry.getKey());
                }
            }
        }else System.out.println("can't find this Name ");
        System.out.println();
    }
}
