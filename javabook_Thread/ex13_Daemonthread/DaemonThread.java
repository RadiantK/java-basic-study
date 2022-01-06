package ex13_Daemonthread;

public class DaemonThread implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {

		Thread t = new Thread(new DaemonThread());
		System.out.println(t.getName());
		t.setDaemon(true); // ����������� �Ϲݾ����尡 �ϳ��� ������ �ڵ�����
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {

			}
			System.out.println(i);
			
			if(i==5) {
				autoSave = true;
			}
				
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
	public void run() {
		while(true) { // ���ѷ���
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
			if(autoSave) {
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("�۾������� �ڵ� ����Ǿ����ϴ�.");
	}
}
