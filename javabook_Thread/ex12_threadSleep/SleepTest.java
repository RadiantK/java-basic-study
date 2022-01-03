package ex12_threadSleep;

class Thread1 extends Thread {
	public void run() {
		for(int i=0; i < 200; i++) {
			System.out.print("��");
		}
		System.out.print("<<th1 ����>>");
	}
}

class Thread2 extends Thread {
	public void run() {
		for(int i=0; i < 200; i++) {
			System.out.print("��");
		}
		System.out.print("<<th2 ����>>");
	}
}
public class SleepTest {

	public static void main(String[] args) {

		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();
		
//		try {
//			Thread.sleep(2000); // ������ Thread�� �ؾ��� 
//		} catch(InterruptedException e) {
//					
//		}
		delay(2000);
		
		System.out.println("<< main ���� >>");
	}
	static void delay(long millis) {
		try {
			Thread.sleep(millis); // ������ Thread�� �ؾ��� 
		} catch(InterruptedException e) {
			
		}
	}

}
