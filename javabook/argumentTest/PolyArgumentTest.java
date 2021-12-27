package argumentTest;

class Product {
	int price;
	int bonuspoint;
	
	Product(int price) {
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
}

class Tv extends Product {

	Tv() {
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money=1000;
	int bonusPoint;
	
	
	void Buy(Product pro) {
		if(money< pro.price) {
			System.out.println("잔액이 모자릅니다. 구매할 수 없습니다.");
			return;
		}
		money -= pro.price;
		bonusPoint += pro.bonuspoint;
		System.out.println(pro + "를 구매했습니다.");
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		b.Buy(tv);
		b.Buy(com);
		
		System.out.println("구매하고 남은 돈은 " + b.money +"입니다.");
		System.out.println("보너스포인트 " + b.bonusPoint +"입니다.");
	}

}
