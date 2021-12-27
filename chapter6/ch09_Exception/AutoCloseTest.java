package ch09_Exception;

public class AutoCloseTest {

	public static void main(String[] args) {

		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj) {
		//	throw new Exception(); // Exception 강제로 발생
		} catch(Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");
	}

}
