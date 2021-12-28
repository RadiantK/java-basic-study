package ch04Override;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerKang = new Customer(1001, "강감찬");
		
		int price = customerKang.calcPrice(1000);
		customerKang.bonusPoint = 1000;
		System.out.println(customerKang.showCustomerInfo() + price);
		
		
		VipCustomer customerKim = new VipCustomer(1002, "김유신");
		
		price = customerKim.calcPrice(1000);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo() + price);
		
		Customer vc = new VipCustomer(12345, "noName");
		vc.calcPrice(1000);
		
		System.out.println(vc.calcPrice(1000));
	}
	

}
