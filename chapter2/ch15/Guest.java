package ch15;

public class Guest {

	String name;
	int money;
	
	public Guest(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTexi(Texi texi) {
		texi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(name + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}
