package ch22_MultiThread;

class Bank {
	
	private int money = 10000;
	// synchronized로 되있는 메서드를 실행하는 동안 메서드가 포함된 객체에 락을검
	// synchronized 메서드
	public synchronized void saveMoney(int save) {
		
		int m = getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	
	// synchronized block
/*	public void saveMoney(int save) {
		
		synchronized (this) {
		
		int m = getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		setMoney(m + save);
		}
	}
	*/
	
	public synchronized void minusMoney(int minus) {
		
		int m = getMoney();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m-minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
		
}

class Park extends Thread {
	
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
	}
}

class ParkWife extends Thread {
	
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
		
	}
}


public class SyncMain {
	
	public static Bank myBank = new Bank();
	

	public static void main(String[] args) {

		Park p = new Park();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ParkWife pw = new ParkWife();
		pw.start();
		
		
	}

}
