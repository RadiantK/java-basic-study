package ch08;

public class Order {

	public String orderNumber;
	public String orderPhoneNumber;
	public String orderAdress;
	public String orderDate;
	public String orderClock;
	public String orderPrice;
	public String orderMenuNumber;
	
	public String showOrder() {
		return "주문 접수 번호: " + orderNumber + '\n'+ "주문 핸드폰 번호: " + orderPhoneNumber +
				'\n'+"주문 주소: " + orderAdress + '\n'+"주문 날짜: " + orderDate + '\n'+"주문 시간: " +
				orderClock + '\n'+"주문 비용: " + orderPrice + '\n'+"주문 메뉴 번호: " + orderMenuNumber;
	}
}
