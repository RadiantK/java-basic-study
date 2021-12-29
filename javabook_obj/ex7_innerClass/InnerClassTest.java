package ex7_innerClass;

class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
//		스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
//		int siv = outerIv; 
		static int scv = outerCv;
	}
	
	void myMethod() {
		final int lv = 0; // 값이 바뀌지 않는 변수는 상수로 간주
		final int LV = 0; // 상수는 메서드가 종료되도 사용 가능
		
		@SuppressWarnings("unused")
		class LocalInner { // 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; // lv값이 바뀌면 에러
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
