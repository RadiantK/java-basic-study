package ch04;

public class OrderTest {

	public static void main(String[] args) {

		Order OrderKang = new Order();
		OrderKang.orderNum = 1234;
		OrderKang.setBuyerID("Kang");
		OrderKang.sellerID = "4321";
		OrderKang.orderDate = "12¿œ";
		
		OrderKang.orderUserInfo();
	}

}
