package ch07_Stream_ex;

import java.util.ArrayList;
import java.util.List;

public class TrevelCustomerlTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 50);
		
		List<TravelCustomer> list = new ArrayList<>();
		
		list.add(customerLee);
		list.add(customerKim);
		list.add(customerHong);
		
		System.out.println("�� ��� ���");
		list.stream().map(c->c.getName()).forEach(key -> System.out.println(key));
		System.out.println("");
		
		System.out.println("������ �հ�");
		int total = list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total+"����");
		System.out.println("");
		
		System.out.println("20�� �̻� �� ����");
		list.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted()
		.forEach(s->System.out.println(s));
	}

}
