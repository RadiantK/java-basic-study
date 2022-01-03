package ex12_threadInterrupted;

import javax.swing.JOptionPane;

class MyThread extends Thread {
	@Override
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x = 0; x < 20000000000L; x++);
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}

public class InterruptedTest {

	public static void main(String[] args) {

		MyThread th1 = new MyThread();
		th1.start();
		
		System.out.println("isInterrupted(): " + th1.isInterrupted());
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt();
		System.out.println("isInterrupted(): " + th1.isInterrupted());
		// 코드는 main쓰레드가 실행, main쓰레드가 인터럽트 되었는지 확인 / th1 x 
		System.out.println("Interrupted(): " + Thread.interrupted());
	}

}
