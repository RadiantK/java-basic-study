package ch02extends;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerKang = new Customer();
		
		customerKang.setCustomerName("������");
		customerKang.setCustomerId(10000);
		customerKang.bonusPoint = 1000;
		System.out.println(customerKang.showCustomerInfo());
		
		
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCustomerId(10001);
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
