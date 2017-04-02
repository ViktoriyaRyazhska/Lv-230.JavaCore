package com.home;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by kitty on 4/2/17.
 */
public class Number{
    Integer line;

    public Number(Integer l){
        this.line = l;

    }

    public Integer realNumber(int start, int end){
            if (line > start && line < end) {
                System.out.printf(String.valueOf(line));
            }
            return 0;
    }
}
