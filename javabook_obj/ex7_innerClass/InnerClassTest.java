package ex7_innerClass;

class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
//		����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ� ����� ������ �� ����.
//		int siv = outerIv; 
		static int scv = outerCv;
	}
	
	void myMethod() {
		final int lv = 0; // ���� �ٲ��� �ʴ� ������ ����� ����
		final int LV = 0; // ����� �޼��尡 ����ǵ� ��� ����
		
		@SuppressWarnings("unused")
		class LocalInner { // ���� ���� Ŭ������ ���ΰ� �ִ� �޼����� ����� ��밡��
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; // lv���� �ٲ�� ����
			int liv4 = LV;
			
			void method() {
				
			}
		}
	}
	
}

public class InnerClassTest {

	public static void main(String[] args) {
		
		
	}

}
