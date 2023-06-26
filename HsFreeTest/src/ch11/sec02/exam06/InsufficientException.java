package ch11.sec02.exam06;

public class InsufficientException extends Exception{ //일반 예외로 선언
	
	public InsufficientException() {
	}
	
	public InsufficientException(String message) {
		super(message);
	}

}
