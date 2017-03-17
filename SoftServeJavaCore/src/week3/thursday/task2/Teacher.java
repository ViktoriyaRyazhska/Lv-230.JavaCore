package week3.thursday.task2;

/**
 * In other classes in body of method print() output text “I am a …”.
 * In each concrete class create constant TYPE_PERSON.
 * Output type of person in each constructors.
 */
public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";
    private int workHours;
    private int salaryPerHour;

    public Teacher(int workHours, int salaryPerHour) {
        setWorkHours(workHours);
        setSalaryPerHour(salaryPerHour);
        System.out.println(Teacher.TYPE_PERSON);
    }

    @Override
    public int salary() {
        return getWorkHours() * getSalaryPerHour();
    }

    @Override
    public void print() {
        System.out.println("I am a teacher.");
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
