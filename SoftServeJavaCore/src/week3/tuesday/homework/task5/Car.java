package week3.tuesday.homework.task5;

/**
 * Create class Car with fields type, year of production and engine capacity.
 */
public class Car {
    private String type;
    private int year;
    private int capasityEngine;

    public Car(String type, int year, int capasityEngine) {
        this.type = type;
        this.year = year;
        this.capasityEngine = capasityEngine;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getCapasityEngine() {
        return capasityEngine;
    }
}
