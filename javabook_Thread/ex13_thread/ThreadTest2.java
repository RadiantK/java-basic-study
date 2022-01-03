package ex13_thread;

class Thread12 extends Thread {
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.print(new String("ㅡ"));
		}
	}
}

class Thread22 extends Thread {
	
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.print(new String("ㅣ"));
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		Thread12 t12 = new Thread12();
		Thread22 t22 = new Thread22();
		
		t12.start();
		t22.start();
		
		try {
			t12.join();
			t22.join();
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.print("소요시간: "+ (System.currentTimeMillis()-startTime));
	}

}
