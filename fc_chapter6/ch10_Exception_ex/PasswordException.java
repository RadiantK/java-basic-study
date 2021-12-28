package ch10_Exception_ex;

@SuppressWarnings("serial") // 노란줄안뜨게 그냥 해논거
public class PasswordException extends Exception {

	public PasswordException(String message) {
		super(message);
	}
}
