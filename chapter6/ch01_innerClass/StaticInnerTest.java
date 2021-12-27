package ch01_innerClass;

class OutClass2 {
	
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass2() {
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
	
	static class InStaticClass { // ���� ���� Ŭ����
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() { 
//			���� Ŭ������ �޼��忡�� �ܺ�Ŭ������ �ν��Ͻ� ���� ���Ұ�, ����Ŭ���� �ν��Ͻ� ������ ��������
//			�޼��尡 ȣ�� �� �� �ֱ� ������ ��� �Ұ�
//			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass num = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + sInNum + "(���� Ŭ������ ������ ����)");
			
		}
		static void sTest() {
//			���� ���� �޼���� ����ƽ �����鸸 ��밡��
//			����Ŭ������ �����޼���� ����Ŭ������ �������� ȣ��ɼ� �ֱ⶧���� ����Ŭ������ �ν��Ͻ����� ���Ұ�
//			System.out.println("OutClass num = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + sInNum + "(���� Ŭ������ ������ ����)");
		}
	}
}

public class StaticInnerTest {

	public static void main(String[] args) {
		
//		OutClass outClass = new OutClass();
//		
//		outClass.usingClass();
		
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
		
		sInClass.inTest();
		
		System.out.println();
		
		OutClass2.InStaticClass.sTest(); // �ٷ� ȣ�Ⱑ�� 
		
	}

}
