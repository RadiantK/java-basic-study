package threadTest;

class Account {
	int balance = 1000;
	
	public synchronized void withdraw(int money) {
		if(balance>=money) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
			balance -= money;
		}
	}
}

class RunnableTest implements Runnable {
	Account ac = new Account();
	
	@Override
	public void run() {
		while(ac.balance>0) {
			int money = (int)(Math.random()*3+1)*100;
			ac.withdraw(money);
			System.out.println("balance = "+ ac.balance);
		}
	}
}

public class ThreadSyncTest {

	public static void main(String[] args) {

		Runnable r1 = new RunnableTest();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		
	}

}
