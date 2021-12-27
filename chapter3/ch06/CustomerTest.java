package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10020, "James");
		Customer customerE = new GoldCustomer(10030, "Edward");
		Customer customerP = new GoldCustomer(10040, "Park");
		Customer customerK = new VipCustomer(10050, "Kim");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		 
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("");
		
		int price = 10000;
		for (Customer customer: customerList) {
			
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "���� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�Դϴ�.");		
		}
	}

}
