package ex13_threadjoin;

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

public class JoinTest {
	static long startTime = 0;
	
	public static void main(String[] args) {

		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();		
		
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); // main�����尡 th1�����尡 �۾��� ���������� ��ٸ�
			th2.join(); // main�����尡 th2�����尡 �۾��� ���������� ��ٸ�
		} catch (InterruptedException e) {
			
		}
		System.out.println("�ҿ�ð� :  " +(System.currentTimeMillis() - startTime));
	}

}
