package week2.thursday.homework.tests.task1.a;

import org.junit.Test;
import week2.thursday.homework.task1.a.Main;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void isInMinRangeTest() {
        assertTrue(Main.isInRange(-5.0f));
    }

    @Test
    public void isInMaxRangeTest() {
        assertTrue(Main.isInRange(5.0f));
    }
}