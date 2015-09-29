package cal;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exception.NegativeNumberFormatException;
import util.Util;

public class Calculator {

	private ArrayList<Integer> input;

	public ArrayList<Integer> getInput() {
		if (input.isEmpty())
			return new ArrayList<Integer>();
		return input;
	}

	public void setInput(ArrayList<Integer> input) {
		this.input = input;
	}

	private Integer sum;

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Calculator() {
		input = new ArrayList<Integer>();
		sum = 0;
	}

	public Calculator(ArrayList<Integer> inp) {
		input = inp;
		sum = 0;
	}

	/**
	 * 2.Allow the Add method to handle an unknown amount of numbers
	 * 
	 * @param str
	 * @return
	 */
	public void Add(String str) {
		if (!str.isEmpty()) {
			input = Util.Convert(str);
			for (int j = 0; j < input.size(); j++) {
				sum += input.get(j);
			}
		}

	}

	/**
	 * 3. Allow the Add method to handle new lines between numbers (instead of commas).
	 * @param str
	 */
	public void AddNewLines(String str) {

		if (!str.isEmpty()) {
			input = Util.ConvertNewLines(str);
			for (int j = 0; j < input.size(); j++) {
				sum += input.get(j);
			}
		}

	}

	/**
	 * 4. Support different delimiters
	 * @param str
	 */
	public void AddDelimiters(String str) {
		if (!str.isEmpty()) {
			input = Util.ConvertDelimiters(str);
			for (int j = 0; j < input.size(); j++) {
				sum += input.get(j);
			}
		}
	}
	
	public void AddExceptionNegative(String str) throws Exception {
		if (!str.isEmpty()) {
			input = Util.ConvertExceptionNegative(str);
			for (int j = 0; j < input.size(); j++) {
				sum += input.get(j);
			}
		}
	}
}
