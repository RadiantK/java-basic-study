package ex13_thread;

class MyThread1 extends Thread {
	
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print(this.getName());
		}
	}
}

class MyThread2 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print(Thread.currentThread().getName());
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		
		Runnable r = new MyThread2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}

}
