package ch09abstract;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("ȭ��");
	}
	
	@Override
	public void typing() {
		System.out.println("Ÿ����");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off");
	}
	
	
	
}
