package ch04;

public class Order {
	
	public int orderNum;
	public String buyerID;
	public String sellerID;
	public String orderDate;
	
	public void orderUserInfo() {
		System.out.println("�ֹ��� ��ȣ�� " + orderNum + " ������ ���̵�� " + buyerID + " �Ĵ»�� ���̵�� " + sellerID + " �ֹ� ���� �������� " + orderDate);
	}

	public void setBuyerID(String name) {
		buyerID = name;
	}
}
