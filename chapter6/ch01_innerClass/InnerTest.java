package ch01_innerClass;


class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass { // private�� �ƴϸ� �ܺο����� ��������, �߾Ⱦ��� ���� private
		
		int iNum = 100;
		
//		static int sInNum = 500; ���������� ��������Ŭ�����ܿ� ���Ұ�
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
}

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		
		outClass.usingClass();
		
		// public �϶� 
		// OutClass.InClass inner = outClass.new InClass();
		// inner.inTest();
	}

}
