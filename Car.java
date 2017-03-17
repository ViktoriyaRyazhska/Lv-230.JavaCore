package com.homework;

/**
 * Created by kitty on 3/17/17.
 */
public class Car {
    private String type;
    private Integer yeat_of_production;
    private Integer engine_capacity;

    public Car (String type, int year_of_production, int engine_capacity){
        this.type = type;
        this.yeat_of_production = year_of_production;
        this.engine_capacity = engine_capacity;
    }

        public Integer getYear (){
            return yeat_of_production;
        }
        public String getModel (){
        return type;
        }

    }

