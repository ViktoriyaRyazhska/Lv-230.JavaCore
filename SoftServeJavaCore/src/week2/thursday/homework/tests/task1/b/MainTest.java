package week2.thursday.homework.tests.task1.b;

import org.junit.Test;
import week2.thursday.homework.task1.b.Main;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMax() {
        assertTrue(Main.max(1, 2, 3) == 3);
        assertTrue(Main.max(1, 3, 2) == 3);
        assertTrue(Main.max(3, 2, 1) == 3);
        assertTrue(Main.max(3, 1, 2) == 3);
        assertTrue(Main.max(2, 3, 1) == 3);
        assertTrue(Main.max(2, 1, 3) == 3);
    }

    @Test
    public void testMin() {
        assertTrue(Main.min(1, 2, 3) == 1);
        assertTrue(Main.min(1, 3, 2) == 1);
        assertTrue(Main.min(3, 2, 1) == 1);
        assertTrue(Main.min(3, 1, 2) == 1);
        assertTrue(Main.min(2, 3, 1) == 1);
        assertTrue(Main.min(2, 1, 3) == 1);
    }
}