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





public class TestHTTPErrors {
    Solution InstanceForTest = new Solution();
    
 	@org.junit.Test
	public void testSolution1a() {
		assertEquals("BadRequest",InstanceForTest.NumberOFError(400));
		assertEquals("Unauthorized",InstanceForTest.NumberOFError(401));
		assertEquals("PaymentRequired",InstanceForTest.NumberOFError(402));	
		assertEquals("unknown mistake",InstanceForTest.NumberOFError(399));
		assertEquals("unknown mistake",InstanceForTest.NumberOFError(403));	
	}

}
