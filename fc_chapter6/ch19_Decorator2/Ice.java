package ch19_Decorator2;

public class Ice extends Decorator {

	public Ice(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print(" adding Ice");
	}

}
