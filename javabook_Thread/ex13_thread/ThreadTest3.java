package ex13_thread;

import javax.swing.JOptionPane;

public class ThreadTest3 {

	public static void main(String[] args) throws Exception {
		Thread33 t33 = new Thread33();
		t33.start();

		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ����" + input + " �Դϴ�.");
	}

}

class Thread33 extends Thread {
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
