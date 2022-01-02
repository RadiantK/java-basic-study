package ex12_thread;

class Thread41 extends Thread {
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.print(new String("ㅡ"));
			for(int x=0; x<1000000; x++); // 시간 지연용 
		}
	}
}

class Thread42 extends Thread {
	
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.print(new String("ㅣ"));
			for(int x=0; x<1000000; x++); // 시간 지연용 
		}
	}
}

public class ThreadTest4 {
	public static void main(String[] args) {
		
		Thread41 t41 = new Thread41();
		Thread42 t42 = new Thread42();
		
//		t41.setPriority(5); 보통 우선순위
		t42.setPriority(7);
		
		System.out.println("Proproty pf t41(ㅡ)"+ t41.getPriority());
		System.out.println("Proproty pf t42(ㅣ)"+ t42.getPriority());
		
		t41.start();
		t42.start();
		
	}

}
