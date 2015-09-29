package cal;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Create a simple String calculator with a method int Add(string numbers)
 * @author tiennguyen
 *
 */
public class CalculatorTest01 {

	@Test
	public void test01() {
		String log1="2. Start with the simplest test case of an empty string and move to 1 and two numbers";
		
		Summary sum1= new Summary();
		sum1.Add("");
	    System.out.println(log1+"   sum1= "+sum1.getSum());	
       	
	}
	
	@Test
	public void test02() {
		String log1="1. Create a simple String calculator with a method int Add(string numbers)\n";
		
		Summary sum1= new Summary();
		sum1.Add("1,2,3");
	    System.out.println(log1+"   sum1= "+sum1.getSum());	
       	
	}
     
	
}
