package cal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 2. Allow the Add method to handle an unknown amount of numbers
 * @author tiennguyen
 *
 */
public class CalculatorTest02 {

	@Test
	public void test01() {
		Calculator sum1 = new Calculator();
		sum1.Add("1,2,3");
		System.out.println("sum1: " + sum1.getSum());
	}

	@Test
	public void test02() {
		Calculator sum2 = new Calculator();
		sum2.Add("");
		System.out.println("sum2: " + sum2.getSum());
	}
}
