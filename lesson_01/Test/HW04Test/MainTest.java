package HW04Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import HW04.Breed;
import HW04.Dog;
import HW04.Main;

public class MainTest {

	@Test
	public void findBiggestTest(){
		assertEquals(Main.findBigest(32, 12), 32);
	}
	
	@Test
	public void findLessNumberTest(){
		assertEquals(2, Main.findLessNumber(21, 2));
	}
	
	@Test
	public void isContTest(){
		assertTrue(Main.isCont(-4.14f));
	}
	
	@Test
	public void compareAgeTest(){
		Dog dog1 = new Dog("bbb", Breed.ALABAY, 1);
		Dog dog2 = new Dog("aaa", Breed.BOXER, 3);
		assertEquals(dog2, Main.compareAge(dog1, dog2));
	}
	
}
