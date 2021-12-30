package ex8_Exception;

public class ExceptionTest {

	public static void main(String[] args) {

		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				System.out.println("ArithmeticException");
			}
		} catch (Exception e) { // 모든 예외의 최고조상(마지막에 씀)
			System.out.println("Exception");
		}
		System.out.println(6);
		
	}

}
