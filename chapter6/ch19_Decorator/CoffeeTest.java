package ch19_Decorator;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		System.out.println("");
		
		Coffee etiopiaLatte = new Latte(etiopiaCoffee);
		etiopiaLatte.brewing();
		System.out.println("");
		
		Coffee etiopiaMocha = new Mocha(etiopiaCoffee);
		etiopiaMocha.brewing();
		System.out.println("");
		
		Coffee iceAmericano = new WhippingCream(new Latte(new IceAmericano()));
		iceAmericano.brewing();

	}	

}
