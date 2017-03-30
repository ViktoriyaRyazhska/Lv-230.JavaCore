package week5.tuesday.task1;

/**
 * In the method main create an array of five plants. Check to work your exceptions.
 */
public class Main {
    public static void main(String[] args) {

        try {
            Plant plant1 = new Plant(5, "RED", "ALGAE");
            Plant plant2 = new Plant(4, "Green", "LIVERWORST");
            Plant plant3 = new Plant(3, "Blue", "MOSSES");
            Plant plant4 = new Plant(2, "Orange", "Algae");
            Plant plant5 = new Plant(1, "violet", "AL");
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage());
        }
    }
}
