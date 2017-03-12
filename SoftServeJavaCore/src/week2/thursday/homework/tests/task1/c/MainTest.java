package week2.thursday.homework.tests.task1.c;

import org.junit.Test;
import week2.thursday.homework.task1.c.Main;

public class MainTest {
    @Test
    public void testGetErrorInformationByCorrectId() {
        Main.getErrorInformation(400);
    }

    @Test
    public void testGetErrorInformationByIncorrectId() {
        Main.getErrorInformation(-5);
    }
}