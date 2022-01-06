package ex13_Daemonthread;

public class DaemonThread implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {

		Thread t = new Thread(new DaemonThread());
		System.out.println(t.getName());
		t.setDaemon(true); // 보조쓰레드는 일반쓰레드가 하나도 없으면 자동종료
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
		System.out.println("프로그램을 종료합니다.");
	}
	public void run() {
		while(true) { // 무한루프
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
		System.out.println("작업파일이 자동 저장되었습니다.");
	}
}
