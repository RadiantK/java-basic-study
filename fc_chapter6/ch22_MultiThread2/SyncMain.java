package ch22_MultiThread2;

class Bank {
	
	private int money = 10000;

	public synchronized void saveMoney(int save) {
		
		int m = getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m+ save);
	}
	
	public synchronized void spendMoney(int spend) {
		
		int m = getMoney();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - spend);
	}
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}	
	
}

class Kim extends Thread {
	
	public void run() {
		System.out.println("Start Save");
		SyncMain.bank.saveMoney(3000);
		System.out.println("Save Money : " + SyncMain.bank.getMoney());
	}
}

class KimWife extends Thread {
	
	public void run() {
		System.out.println("Start Spend");
		SyncMain.bank.spendMoney(1000);
		System.out.println("Spend Money : " + SyncMain.bank.getMoney());
	}
}



public class SyncMain {
	
	public static Bank bank = new Bank();

	public static void main(String[] args) {

		Kim kim = new Kim();
		
		kim.start();
		
		KimWife wife = new KimWife();
		
		wife.start();
	}

}
