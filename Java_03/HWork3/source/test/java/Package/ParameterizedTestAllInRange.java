package Package;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
 


@RunWith(Parameterized.class)
public class ParameterizedTestAllInRange {
	Solution InstanceForTest = new Solution();

	private boolean checking;
	private double number1;
	private double number2;
	private double number3;
	

	 public ParameterizedTestAllInRange(boolean checking, double number1, double number2, double number3) {
		super();
		this.checking = checking;
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}

	@Parameters
	 public static Collection<Object[]> data() {
	 Object[][] data = new Object[][] { 
	 {true, 1, 2, 3},
	 {false, -10, 1, 3},
	 {true, 1.2, 2.4, 3.5}};
	 return Arrays.asList(data);
	 }

	@org.junit.Test
	public void testSolution1min() {
		assertEquals(checking,InstanceForTest.Solution1a(number1, number2, number3));
	}

}
