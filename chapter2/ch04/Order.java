package ch04;

public class Order {
	
	public int orderNum;
	public String buyerID;
	public String sellerID;
	public String orderDate;
	
	public void orderUserInfo() {
		System.out.println("주문자 번호는 " + orderNum + " 구매자 아이디는 " + buyerID + " 파는사람 아이디는 " + sellerID + " 주문 도착 예정일은 " + orderDate);
	}

	public void setBuyerID(String name) {
		buyerID = name;
	}
}
