package ch01_innerClass;

class OutClass2 {
	
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass2() {
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
	
	static class InStaticClass { // 정적 내부 클래스
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() { 
//			정적 클래스의 메서드에서 외부클래스의 인스턴스 변수 사용불가, 내부클래스 인스턴스 변수가 생성전에
//			메서드가 호출 될 수 있기 때문에 사용 불가
//			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + sInNum + "(내부 클래스의 스태택 변수)");
			
		}
		static void sTest() {
//			정적 내부 메서드는 스태틱 변수들만 사용가능
//			정적클래스의 정적메서드는 정적클래스의 생성전에 호출될수 있기때문에 내부클래스의 인스턴스변수 사용불가
//			System.out.println("OutClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + sInNum + "(내부 클래스의 스태택 변수)");
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
		
		OutClass2.InStaticClass.sTest(); // 바로 호출가능 
		
	}

}
