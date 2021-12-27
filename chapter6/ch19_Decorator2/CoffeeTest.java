package ch19_Decorator2;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee americano = new Americano();
		
		americano.brewing();
		System.out.println("");
		
		Coffee iceAmericano = new Ice(americano);
		iceAmericano.brewing();
		System.out.println("");
		
		Coffee iceLatte = new Latte(iceAmericano);
		iceLatte.brewing();
		
	}

}
