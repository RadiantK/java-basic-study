package ch07_Stream_ex;

import java.util.ArrayList;
import java.util.List;

public class TrevelCustomerlTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> list = new ArrayList<>();
		
		list.add(customerLee);
		list.add(customerKim);
		list.add(customerHong);
		
		System.out.println("고객 명단 출력");
		list.stream().map(c->c.getName()).forEach(key -> System.out.println(key));
		System.out.println("");
		
		System.out.println("여행비용 합계");
		int total = list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total+"만원");
		System.out.println("");
		
		System.out.println("20세 이상 고객 정렬");
		list.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted()
		.forEach(s->System.out.println(s));
	}

}
