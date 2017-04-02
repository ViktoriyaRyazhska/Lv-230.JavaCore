package com.home;

/**
 * Created by kitty on 4/2/17.
 */
public class Math {

    Double a=0.0;
    Double b=0.0;

    Math(Double a, Double b){
        this.a =a;
        this.b =b;

    }

    Double res=0.0;

    public Double div() {
        try {
            return res = a / b;
        } catch (ArithmeticException e) {
        System.out.println("0 not permitted");
        return 0.0;
        }
    }
}
