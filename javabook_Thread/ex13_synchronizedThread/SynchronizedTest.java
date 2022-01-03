package ex13_synchronizedThread;

class Account {
	private int balance = 1000;
	
	public synchronized int getBalance() {
		return balance;
	}
	public synchronized void withDraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
			balance -=money;
		}	
	}
}
class Runnable12 implements Runnable {
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random()*3+1)*100;
			acc.withDraw(money);
			System.out.println("balance: "+acc.getBalance());
		}
	}
}

public class SynchronizedTest {

	public static void main(String[] args) {

		Runnable12 r = new Runnable12();
		new Thread(r).start();
	}

}
