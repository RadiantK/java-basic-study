package ex13_thread;

import javax.swing.JOptionPane;

public class ThreadTest3 {

	public static void main(String[] args) throws Exception {
		Thread33 t33 = new Thread33();
		t33.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은" + input + " 입니다.");
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
