package ex8_Exception3;

public class Exception4 {

	public static void main(String[] args) {

		// ���� �Ǵ�����
		try {
			method();
		} catch (Exception e) {
			System.out.println("main �޼��忡�� ��ܰ� ó���Ǿ����ϴ�.");
		}
	}
	
	static void method() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method �޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			throw e;
		}
	}

}
