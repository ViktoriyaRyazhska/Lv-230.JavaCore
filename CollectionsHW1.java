package com.home;

import java.util.*;


public class CollectionsHW1 {

   /* static <T> Set<T> union(Set<T> s1, Set<T> s2){
        Set<T> s3 = new HashSet<T>();
        Iterator<T> iterator = s1.iterator();
        while (iterator.hasNext()) {
            s3.add(iterator.next());
        }
        iterator = s2.iterator();
        while (iterator.hasNext()) {
            s3.add(iterator.next());
        }
        return s3;

    }*/
    static <T> Set<T> intersection (Set <T> s1, Set <T> s2){
    Set<T> s3 = new HashSet<T>();
    Iterator<T> iterator = s1.iterator();
    while(iterator.hasNext()){
        if(s2.contains(iterator.next())){
            s3.add(iterator.next());
        }
    }
        return s3;
}


    public static void main(String[] args) {

        Set<Integer> s = new HashSet<Integer>();
        Scanner input = new Scanner(System.in);
        for (int k=0; k<3; ++k){
            System.out.println("Enter number ");
            Integer line = Integer.parseInt(input.nextLine());
            s.add(line);
        }
        Set<Integer> l = new HashSet<Integer>();
        for(int k=0; k<3; ++k){
            System.out.println("Enter number ");
            Integer line = Integer.parseInt(input.nextLine());
            l.add(line);
        }
        intersection(s,l);
        System.out.println("Result " + intersection(s,l));
    }
}
