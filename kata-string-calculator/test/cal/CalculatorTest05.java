package cal;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.NegativeNumberFormatException;

/**
 * 5. Calling Add with a negative number will throw an exception “negatives not allowed” -
 *  and the negative that was passed
 * .if there are multiple negatives, show all of them in the exception message
 * @author tiennguyen
 *
 */
public class CalculatorTest05 {

	@Test
	public void test() {
		Calculator sum2 = new Calculator();
			try {
				sum2.AddExceptionNegative("-1,2,-4,-6,5,3");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("sum2: " + sum2.getSum());
	}
}
