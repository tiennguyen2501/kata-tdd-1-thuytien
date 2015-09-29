package util;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exception.NegativeNumberFormatException;

public class Util {

	public Util() {
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static ArrayList<Integer> Convert(String str) {
		if (str == "")
			return null;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String[] strNum = str.split(",");
		for (int j = 0; j < strNum.length; j++) {
			arr.add(Integer.parseInt(strNum[j]));
		}
		return arr;
	}

	public static ArrayList<Integer> ConvertNewLines(String str) {
		if (str == "")
			return null;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String[] strNum = str.split("[\\s,;\\n\\t]+");
		for (int j = 0; j < strNum.length; j++) {
			arr.add(Integer.parseInt(strNum[j]));
		}
		return arr;
	}

	public static ArrayList<Integer> ConvertDelimiters(String str) {
		if (str == "")
			return null;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Pattern pp = Pattern.compile("\\d+");
		Matcher m = pp.matcher(str);
		while (m.find()) {
			arr.add(Integer.parseInt(m.group()));
		}
		return arr;
	}

	public static ArrayList<Integer> ConvertExceptionNegative(String str) throws Exception
	{
		if(str=="")
			return null;
		ArrayList<Integer> arr= new ArrayList<Integer>();
		Pattern pp = Pattern.compile("(?:^|(?<![-0-9]))([0-9]+)");
		Matcher m = pp.matcher(str);
		Integer num=0;
		while(m.find())
		{
			try{			
			
				num=Integer.parseInt(m.group());
				if(num>0){
					arr.add(num);
				}
				else
					throw new Exception("Number Negative");
			}
			catch(NumberFormatException numFormExc)
			{
		            System.out.println("Invalid input. Input a natural number.");
		    }
			
		}
		return arr;
	}
}
