package ex13_synchronizedThread;

class Account {
	private int balance = 1500;
	
	public int getBalance() {
		return this.balance;
	}
	
	public void withdraw(int money) {
		synchronized(this) {
			if(balance >= money) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance -= money;
			}
		}
	}
}

class Runnable11 implements Runnable {
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("balance : "+acc.getBalance());
		}
	}
}


public class SynchronizedTest {

	public static void main(String[] args) {

		Runnable11 ra = new Runnable11();
		new Thread(ra).start();
		new Thread(ra).start();
		
	}

}
