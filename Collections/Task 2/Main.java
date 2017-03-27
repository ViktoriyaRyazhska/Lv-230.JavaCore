package com.home;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map <String, String> personMap = new HashMap<String, String>();

        personMap.put("Pavliv","Ivan");
        personMap.put("Shokin", "Sergiy");
        personMap.put("Dir", "Orest");
        personMap.put("Kit", "Ivan");

        /*System.out.println(personMap);

        Iterator i = personMap.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry entry1 = (Map.Entry)i.next();
            Iterator j = i;
            while(j.hasNext()){
                Map.Entry entry2 = (Map.Entry)j.next();
                if(entry1.getValue().equals(entry2.getValue())){
                    System.out.println("Name " + entry1.getValue() + " Surname " + entry1.getKey());
                    System.out.println("Name " + entry2.getValue() + " Surname " + entry2.getKey());
                }
            }
        }*/

        Iterator k = personMap.entrySet().iterator();
        while(k.hasNext()){
            Map.Entry entry3 =(Map.Entry)k.next();
            if(entry3.getValue().equals("Orest")){
                personMap.remove(entry3.getKey());
            }
        }
        System.out.println(personMap);

    }
}
