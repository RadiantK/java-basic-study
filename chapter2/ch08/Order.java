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
		return "�ֹ� ���� ��ȣ: " + orderNumber + '\n'+ "�ֹ� �ڵ��� ��ȣ: " + orderPhoneNumber +
				'\n'+"�ֹ� �ּ�: " + orderAdress + '\n'+"�ֹ� ��¥: " + orderDate + '\n'+"�ֹ� �ð�: " +
				orderClock + '\n'+"�ֹ� ���: " + orderPrice + '\n'+"�ֹ� �޴� ��ȣ: " + orderMenuNumber;
	}
}
