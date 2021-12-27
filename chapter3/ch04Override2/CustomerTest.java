package ch04Override2;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerKang = new Customer(1001, "Kang");
		
		customerKang.bonusPoint = 1000;
		int price = customerKang.calcPrice(10000);
		
		System.out.println(customerKang.showInfo() + price);
		
		VipCustomer customerKim = new VipCustomer(1002, "Kim");
		
		customerKim.bonusPoint = 1000;
		price = customerKim.calcPrice(10000);
		
		System.out.println(customerKim.showInfo() + price);
	}

}
