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
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}

public class InterruptedTest {

	public static void main(String[] args) {

		MyThread th1 = new MyThread();
		th1.start();
		
		System.out.println("isInterrupted(): " + th1.isInterrupted());
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th1.interrupt();
		System.out.println("isInterrupted(): " + th1.isInterrupted());
		// �ڵ�� main�����尡 ����, main�����尡 ���ͷ�Ʈ �Ǿ����� Ȯ�� / th1 x 
		System.out.println("Interrupted(): " + Thread.interrupted());
	}

}
