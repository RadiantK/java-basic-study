package ch01_innerClass;


class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass { // private이 아니면 외부에서도 생성가능, 잘안쓰임 거의 private
		
		int iNum = 100;
		
//		static int sInNum = 500; 정적변수는 정적내부클래스외엔 사용불가
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
			
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
		
		// public 일때 
		// OutClass.InClass inner = outClass.new InClass();
		// inner.inTest();
	}

}
