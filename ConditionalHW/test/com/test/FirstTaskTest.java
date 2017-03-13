package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.first.MaxAndMin;

public class FirstTaskTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	
	@After
	public void tearDown() throws Exception {
	}
	
	MaxAndMin maxAndMin = new MaxAndMin();
	@Test
	public void testMaxAndMin(){
		assertTrue(maxAndMin.outputMaxAndMin());
		
	}

//	@Test
//	public final void test() {
//		fail("Not yet implemented"); // TODO
//	}

}
