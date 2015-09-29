package cal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 4. Support different delimiters
 * @author tiennguyen
 *
 */
public class CalculatorTest04 {

	@Test
	public void test() {		
		Calculator sum2 = new Calculator();
		sum2.AddDelimiters("-1\n#@$@2,3");
		System.out.println("sum2: " + sum2.getSum());
	}

}
