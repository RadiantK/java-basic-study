package ch03_2;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerKang = new Customer();
		
		customerKang.setCustomerID(1001);
		customerKang.setCustomerName("Kang");
		customerKang.bonusPoint = 1000;
		int price = customerKang.calcPrice(10000);
		
		System.out.println(customerKang.showInfo() + price);
		
		VipCustomer customerKim = new VipCustomer();
		
		customerKim.setCustomerID(1002);
		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint = 1000;
		price = customerKim.calcPrice(10000);
		
		System.out.println(customerKim.showInfo() + price);
	}

}
