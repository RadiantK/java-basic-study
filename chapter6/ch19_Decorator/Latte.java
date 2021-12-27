package ch19_Decorator;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
		// 상위 클래스에 default 생성자가 없으면 매개변수가 있는 super를 명시적으로 호출해야함
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk");
	}

}
