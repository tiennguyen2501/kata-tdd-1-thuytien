package exception;

public class NegativeNumberFormatException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeNumberFormatException(Integer i)
    {
        super("Invalid negative number "+i);
        System.out.println("Invalid negative number "+i);
    }
	
}
