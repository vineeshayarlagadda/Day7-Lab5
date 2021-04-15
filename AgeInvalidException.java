package day7Lab5;

public class AgeInvalidException extends Exception{
	String exceptionMessage="";

	
	
	public AgeInvalidException() {
		super();
	}

	public AgeInvalidException(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}

	@Override
	public String toString() {
		return "Invalid Age Exception : "+exceptionMessage;
	}
	

}
