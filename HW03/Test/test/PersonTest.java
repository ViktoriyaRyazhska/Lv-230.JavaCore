package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import HW03.Person;

public class PersonTest {
	
	private static Person p;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Person();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
	}

	@Before
	public void setUp() throws Exception {
		
		p.setName("Ivan");
		p.setBirthYear(1986);
	}

	@After
	public void tearDown() throws Exception {
		p.setName("Petro");
	}

	@Test
	public void testGetName() {
		assertEquals("Ivan", p.getName());
		
	}

	@Test
	public void testAge() {
		assertEquals(31, p.age());
	}

}
