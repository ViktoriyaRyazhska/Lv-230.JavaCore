package com.home;

import java.util.Comparator;

/**
 * Created by kitty on 3/26/17.
 */
public class NameComparator implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        return ((Student)o1).name.compareTo(((Student)o2).name);
    }
}
