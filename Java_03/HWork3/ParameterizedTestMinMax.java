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
public class ParameterizedTestMinMax {
	Solution InstanceForTest = new Solution();

	private int min;
	private int max;
	private int number1;
	private int number2;
	private int number3;

	public ParameterizedTestMinMax(int min,int max, int number1, int number2, int number3) {
		super();
		this.min = min;
		this.max = max;
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;

	}


	 @Parameters
	 public static Collection<Object[]> data() {
	 Object[][] data = new Object[][] { 
	 {10, 56, 13, 56, 10},
	 {1, 506, 1, 506, 10},
	 {-12, 13, 13, 6, -12},
	 {-113, 10, 1, -113, 10}};
	 return Arrays.asList(data);
	 }

	@org.junit.Test
	public void testSolution1min() {
				 
		assertEquals(min, InstanceForTest.Solution1bmin(number1, number2, number3));
		assertEquals(max, InstanceForTest.Solution1bmax(number1, number2, number3));

	}

}
