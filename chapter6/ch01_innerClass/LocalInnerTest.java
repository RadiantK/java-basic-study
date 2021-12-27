package ch01_innerClass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { 
		// 매개변수와 매서드 내의 지역변수는 스택메모리에 생성되야하지만,
		// 메서드 종료시 사라져버리므로 run()에서 다시 사용할 수 있도록 상수값으로 바뀌어버림
		int num = 10;
		
		class MyRunnable implements Runnable { 

			
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
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");

				}
			
		}
		return new MyRunnable();
	}	
}



public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}
