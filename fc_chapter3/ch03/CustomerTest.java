package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerKang = new Customer(1001, "������");
		
//		customerKang.setCustomerName("������");
//		customerKang.setCustomerId(10000);
		customerKang.bonusPoint = 1000;
		System.out.println(customerKang.showCustomerInfo());
		
		
		VipCustomer customerKim = new VipCustomer(1002, "������");
		
//		customerKim.setCustomerName("������");
//		customerKim.setCustomerId(10001);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
//		Customer vc = new VipCustomer(12345, "noname");
		// vip�� �ν��Ͻ� ���¿��� Ÿ���� customer�� ����ȯ �Ʊ� ������
		// costomer�� �͸� �� �� ����.
	}

}
