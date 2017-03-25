package temp;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Chris", "Brown");
        map.put("Steve", "Jobs");
        map.put("George", "Carlin");
        map.put("Will", "Smith");
        map.put("Jake", "Gyllenhaal");
        map.put("Hugh", "Jackman");
        map.put("Bill", "Gates");
        map.put("Billa", "Gates");

        showMap(map);
        sameName(map);
        removeSomeName(map, "Smith");
        showMap(map);
    }
    public static void showMap(Map<String, String> map){
        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        System.out.println();
    }



    public static void sameName(Map<String, String> map){
        HashMap<String, String> map3 = new HashMap<>(map);
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            map3.remove(pair.getKey());
            if (map3.containsValue(pair.getValue())) {
                count++;
            }
        }
        String s =  (count>0) ? "Thre are "+count+" duplicate":"Every person are unique";
        System.out.println(s+'\n');
    }

    public static void removeSomeName(Map<String, String> map, String name){

        // Чому я не можу видалити обєкт ось так ?

//        for(Map.Entry<String, String> entry:map.entrySet()){
//            if(name.equals(entry.getValue())){
//                copy.remove(entry.getKey());
//            }
//        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (name.equals(iterator.next().getValue())) {
                iterator.remove();
            }
        }
    }


}
