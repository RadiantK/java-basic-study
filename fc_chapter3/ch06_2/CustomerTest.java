package ch06_2;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerK = new Customer(1001, "Kong");
		Customer customerT = new Customer(1001, "Tomas");
		Customer customerL = new GoldCustomer(1001, "Lana");
		Customer customerZ = new VipCustomer(1001, "Zara");
		Customer customerM = new VipCustomer(1001, "Mina");
		
		customerList.add(customerK);
		customerList.add(customerT);
		customerList.add(customerL);
		customerList.add(customerZ);
		customerList.add(customerM);
		
		for (Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		int price = 10000;
		for (Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� ���� �ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + " �Դϴ�.");
		}
		
	}

}
