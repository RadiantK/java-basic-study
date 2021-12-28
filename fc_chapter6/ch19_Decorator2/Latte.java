package ch19_Decorator2;

public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		super(coffee);
		
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print(" adding Milk");
	}

}
