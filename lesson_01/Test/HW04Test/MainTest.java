package HW04Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import HW04.Main;

public class MainTest {

	@Test
	public void findBiggestTest() {
		assertEquals(Main.findBigest(32, 12), 32);
	}
	
	@Test
	public void isContTest(){
		assertTrue(Main.isCont(-4.14f));
	}
}
