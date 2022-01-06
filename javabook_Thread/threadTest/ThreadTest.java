package threadTest;

class Thread1 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print("l");
		}
		System.out.println("Thread1 종료");
	}
}

class Thread2 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print("ㅡ");
		}
		System.out.println("Thread2 종료");
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		Runnable r1 = new Thread1();
		Thread th1 = new Thread(r1);
		
		Runnable r2 = new Thread2();
		Thread th2 = new Thread(r2);
		
		
		th1.start();
		th2.start();
		try {
			th1.join();
			th2.join();
//			Thread.sleep(2000);
		} catch(InterruptedException e) {
			
		}
		System.out.println("main 종료");
		
	}

}
