package cal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Allow the Add method to handle new lines between numbers (instead of commas).
 * @author tiennguyen
 *
 */
public class CalculatorTest03 {

	@Test
	public void test() {
		
		Calculator sum = new Calculator();
		sum.AddNewLines("1\n2,3");
		System.out.println("sum: " + sum.getSum());
	}

}
