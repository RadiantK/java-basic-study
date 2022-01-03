package ex13_threadjoin;

class Thread1 extends Thread {
	public void run() {
		for(int i=0; i < 200; i++) {
			System.out.print("ㅣ");
		}
		System.out.print("<<th1 종료>>");
	}
}

class Thread2 extends Thread {
	public void run() {
		for(int i=0; i < 200; i++) {
			System.out.print("ㅡ");
		}
		System.out.print("<<th2 종료>>");
	}
}

public class JoinTest {
	static long startTime = 0;
	
	public static void main(String[] args) {

		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();		
		
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); // main쓰레드가 th1쓰레드가 작업이 끝날때까지 기다림
			th2.join(); // main쓰레드가 th2쓰레드가 작업이 끝날때까지 기다림
		} catch (InterruptedException e) {
			
		}
		System.out.println("소요시간 :  " +(System.currentTimeMillis() - startTime));
	}

}
