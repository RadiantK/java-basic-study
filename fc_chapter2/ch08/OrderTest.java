package ch08;

public class OrderTest {

	public static void main(String[] args) {

		Order orderUser = new Order();
		orderUser.orderNumber = "202011020003";
		orderUser.orderPhoneNumber = "01023450001";
		orderUser.orderAdress = "서울시 강남구 역삼동 111-333";
		orderUser.orderDate = "20201102";
		orderUser.orderClock = "130258";
		orderUser.orderPrice = "35000";
		orderUser.orderMenuNumber = "0003";
		
		System.out.println(orderUser.showOrder());
	}

}
