package ex12_thread;

class Thread41 extends Thread {
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.print(new String("��"));
			for(int x=0; x<1000000; x++); // �ð� ������ 
		}
	}
}

class Thread42 extends Thread {
	
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.print(new String("��"));
			for(int x=0; x<1000000; x++); // �ð� ������ 
		}
	}
}

public class ThreadTest4 {
	public static void main(String[] args) {
		
		Thread41 t41 = new Thread41();
		Thread42 t42 = new Thread42();
		
//		t41.setPriority(5); ���� �켱����
		t42.setPriority(7);
		
		System.out.println("Proproty pf t41(��)"+ t41.getPriority());
		System.out.println("Proproty pf t42(��)"+ t42.getPriority());
		
		t41.start();
		t42.start();
		
	}

}
