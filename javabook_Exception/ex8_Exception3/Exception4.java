package ex8_Exception3;

public class Exception4 {

	public static void main(String[] args) {

		// 예외 되던지기
		try {
			method();
		} catch (Exception e) {
			System.out.println("main 메서드에서 얘외가 처리되었습니다.");
		}
	}
	
	static void method() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method 메서드에서 예외가 처리되었습니다.");
			throw e;
		}
	}

}
