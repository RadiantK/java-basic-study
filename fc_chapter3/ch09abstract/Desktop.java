package ch09abstract;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("화면");
	}
	
	@Override
	public void typing() {
		System.out.println("타이핑");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off");
	}
	
	
	
}
