package week2.thursday.homework.tests.task2;

import org.junit.Test;
import week2.thursday.homework.task2.Dog;
import week2.thursday.homework.task2.Main;

import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void testHasSameName(){
        assertTrue(!Main.hasSameName(new Dog("1"), new Dog("2"), new Dog("3")));
        assertTrue(Main.hasSameName(new Dog("1"), new Dog("1"), new Dog("3")));
        assertTrue(Main.hasSameName(new Dog("1"), new Dog("1"), new Dog("1")));
    }
    @Test
    public void testGetTheOldestDog() {
        assertTrue(Main.getTheOldestDog(new Dog(1), new Dog(2), new Dog(3)).getAge() == 3);
        assertTrue(Main.getTheOldestDog(new Dog(1), new Dog(3), new Dog(2)).getAge() == 3);
        assertTrue(Main.getTheOldestDog(new Dog(2), new Dog(1), new Dog(3)).getAge() == 3);
        assertTrue(Main.getTheOldestDog(new Dog(2), new Dog(3), new Dog(1)).getAge() == 3);
        assertTrue(Main.getTheOldestDog(new Dog(3), new Dog(2), new Dog(1)).getAge() == 3);
        assertTrue(Main.getTheOldestDog(new Dog(3), new Dog(1), new Dog(2)).getAge() == 3);
    }
}