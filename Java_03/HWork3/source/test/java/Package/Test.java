package Package;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


public class Test {
    Solution InstanceForTest = new Solution();
    
   
	
	@org.junit.Test
	public void testSolution1a() {
		assertEquals(true,InstanceForTest.Solution1a(1, 2, 3));
		assertEquals(false,InstanceForTest.Solution1a(-10, 2, 3));
		assertEquals(true,InstanceForTest.Solution1a(1.2, 2.4, 3.5));
	}

	@org.junit.Test
	public void testCheckNames() {
		assertEquals(false,InstanceForTest.ChecksName("dog1", "dog2", "dog3"));
		assertEquals(true,InstanceForTest.ChecksName("dog1", "dog1", "dog3"));
		assertEquals(true,InstanceForTest.ChecksName("dog1", "dog2", "dog2"));
		assertEquals(true,InstanceForTest.ChecksName("dog3", "dog2", "dog3"));
		}
	
}
