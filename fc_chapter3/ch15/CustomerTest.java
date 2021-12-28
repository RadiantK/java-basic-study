package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer costomer = new Customer();
		
		costomer.buy();
		costomer.sell();
		costomer.order();
		costomer.hello();
		
		Buy buyer = costomer;
		buyer.buy();
		buyer.order();
		
		Sell seller = costomer;
		seller.sell();
		seller.order();
	}

}
