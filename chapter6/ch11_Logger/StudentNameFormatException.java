package ch11_Logger;

@SuppressWarnings("serial")
public class StudentNameFormatException extends IllegalArgumentException{

	public StudentNameFormatException(String message){
		super(message);
	}
}

