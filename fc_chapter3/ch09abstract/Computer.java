package ch09abstract;

public abstract class Computer {

	public abstract void display();
	public abstract void typing();
	
	public void turOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
