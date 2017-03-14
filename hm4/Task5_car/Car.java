public class Car {
    private String name;
    private int yearOFProduction;
    private int engineCapacity;

    public Car(String name, int yearOFProduction, int engineCapacity) {
        this.name = name;
        this.yearOFProduction = yearOFProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getName() {
        return name;
    }

    public int getYearOFProduction() {
        return yearOFProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return  "Name is "+name+", year of production "+yearOFProduction+", engine capacity = "+engineCapacity;
    }
}
