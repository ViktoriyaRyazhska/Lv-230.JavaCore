package week3.thursday.task2;

/**
 * In other classes in body of method print() output text “I am a …”.
 * In each concrete class create constant TYPE_PERSON.
 * Output type of person in each constructors.
 */
public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";
    private int workHours;
    private int salaryPerHour;

    public Cleaner(int workHours, int salaryPerHour) {
        setWorkHours(workHours);
        setSalaryPerHour(salaryPerHour);
        System.out.println(Cleaner.TYPE_PERSON);
    }

    @Override
    public int salary() {
        return getWorkHours() * getSalaryPerHour();
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner.");
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }


}
