package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerKang = new Customer(1001, "강감찬");
		
//		customerKang.setCustomerName("강감찬");
//		customerKang.setCustomerId(10000);
		customerKang.bonusPoint = 1000;
		System.out.println(customerKang.showCustomerInfo());
		
		
		VipCustomer customerKim = new VipCustomer(1002, "김유신");
		
//		customerKim.setCustomerName("김유신");
//		customerKim.setCustomerId(10001);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
//		Customer vc = new VipCustomer(12345, "noname");
		// vip의 인스턴스 상태여도 타입이 customer로 형변환 됐기 때문에
		// costomer의 것만 쓸 수 있음.
	}

}
