package temp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by forest on 22.03.2017.
 */
public class PracticalTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();

        // Чи можна зробити типізований метод без типізаваного классу ?

        for(int i=0; i<10; i++){
            integerList.add((int) (Math.random()*50));
        }


        showList(integerList);

        //greaterThanTwenty(integerList);
/*
Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
 */
        for(int i=0; i<integerList.size(); i++){
            if(i<5){
                integerList.remove(i);
                //--i;
            }
        }


//        for(Integer i:integerList){
//            if(i>10) integerList.remove(i);
//        }
        showList(integerList);
    }
    public static void showList(List<Integer> list){
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println();
    }
    public static void greaterThanTwenty(List<Integer> list){
        for(int i=0; i<list.size(); i++){
            if(list.get(i)<20){           //чому вивидить 20 ?
                list.remove(i);
                --i;                     // чи хороший це варінт видалення з колекцій таким способом ?
            }
        }
    }
}
