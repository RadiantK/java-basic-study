package ch01_innerClass;


class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { 
		// 매개변수와 매서드 내의 지역변수는 스택메모리에 생성되야하지만,
		// 메서드 종료시 사라져버리므로 run()에서 다시 사용할 수 있도록 상수값으로 바뀌어버림
		int num = 10;
		

		return new Runnable() { // 호출될 일이 없기때문에 이름없는 내부클래스 선언
			
			int localNum = 1000;
			
			@Override
			public void run() {
				
				// getRunnale 메서드는 호출되고 종료될때 메모리에서 사라지지만
				// run 메서드는 나중에 다시 호출될 수 있기때문에 변수 선언 불가
				// i = 100; num = 20;
				
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");

				}
			
		};

	}
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable class");
		}
		
	};
	
}


public class AnonymousInnerTest {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
		
		out.runnable.run();
	}

}
