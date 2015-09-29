package exception;

public class SecondException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exceptionName;

	public String getExceptionName() {
		return exceptionName;
	}

	public void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
	}

	public SecondException(){
			 System.out.println("Invalid input. Input a natural number.");
		}
}
