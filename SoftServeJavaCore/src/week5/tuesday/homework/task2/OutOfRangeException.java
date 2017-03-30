package week5.tuesday.homework.task2;

public class OutOfRangeException extends Exception {

    @Override
    public String getMessage() {
        return "Your value is out of range.";
    }
}
