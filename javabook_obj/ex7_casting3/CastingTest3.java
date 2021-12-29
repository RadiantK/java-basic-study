package ex7_casting3;

class Product {
	int price;
	int bonuspoint;
	
	Product(int price) {
		this.price = price;
		this.bonuspoint = (int)(price/10);
	}
}

class Computer extends Product {

	Computer(int price) {
		super(price);
		this.price = price;
	}
	
	public String toString() {
		return "Computer";
	}
	
}

class Tv extends Product {

	Tv(int price) {
		super(price);
		this.price = price;
	}
	public String toString() {
		return "Tv";
	}
	
}

class Phone extends Product {

	Phone(int price) {
		super(price);
		this.price = price;
	}
	public String toString() {
		return "Phone";
	}
	
}

class Buyer {
	int money = 1000;
	int bonuspoint=0;
	Product[] item = new Product[5];
	int i = 0;
	
	void Buy(Product p) {
		if (money<p.price) {
			System.out.println("돈이 모자랍니다.");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		item[i++] = p;
		System.out.println(p + "를 구매했습니다.");	
		
	}
	
	
	void summary() {
		int sum= 0;
		String temp = "";
		
		for (int i=0; i<item.length; i++) {
			
			if (item[i] == null) {
				break;
			}
			sum += item[i].price;
			temp += item[i]+ ",";
		}
		System.out.println("총액: "+sum);
		System.out.println("구매한 것들: "+temp);
	}
	
}

public class CastingTest3 {

	public static void main(String[] args) {

		Computer c = new Computer(150);
		Tv t = new Tv(150);
		Phone p = new Phone(100);
		
		Buyer b = new Buyer();
		b.Buy(c);
		b.Buy(t);
		b.Buy(p);
		b.summary();
		System.out.println();
		System.out.println(b.money+ "원 남았습니다.");
		System.out.println("보너스포인트: " + b.bonuspoint);
		
		
	}

}
