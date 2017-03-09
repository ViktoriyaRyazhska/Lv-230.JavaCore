/**
 * Created by forest on 09.03.2017.
 */
public class Person {
    private String name;
    private int birthYear;

    public Person(){}

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age(){
        return 2017 - birthYear;
    }

    public void input(String inpName, int inpBirthYear){
        if(name != null && birthYear > 0){
            System.out.println("Info about this person already exist");
        }else {
            setName(inpName);
            setBirthYear(inpBirthYear);
            System.out.println("Data entered successfully");
        }
    }
    public void output(){
        System.out.println(toString());
    }

    public void changeName(String name){
        setName(name);
    }

    @Override
    public String toString() {
        return "Name is: "+name+", born in: "+birthYear+", age is: "+age();
    }
}
