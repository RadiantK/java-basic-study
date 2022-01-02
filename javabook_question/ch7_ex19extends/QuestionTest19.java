package ch7_ex19extends;

class Product {
	int price;
	
	Product(int price) {
		this.price = price;
	}
}

class Computer extends Product {
	
	Computer() {
		super(150);

	}
	
	@Override
	public String toString() {
		return "Computer";
	}

}

class Tv extends Product {
	
	Tv() {
		super(150);
	}
	
	@Override
	public String toString() {
		 return "Tv";
	}
}

class Audio extends Product {
	
	Audio() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}


class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		if(money< p.price) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);	
		
	}
	void add(Product p) {
		if(i >= cart.length) {
			Product[] temp = new Product[cart.length*2];
			System.arraycopy(cart, 0, temp, 0, cart.length);	
			cart = temp;
		}
			cart[i++] = p;
			
	}
	void summary() {
		int total = 0;
		String list="";
		
		for(int i=0; i<cart.length;i++) {
			if(cart[i] == null) {
				break;
			}
			list += cart[i]+ " / ";
			total += cart[i].price;
				
		}
		System.out.println("사용한 금액 : " + total);
		System.out.println("구매한 것들 : " + list.toString());
		System.out.println("남은돈 : " + money);	
	}
}

public class QuestionTest19 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		
		b.summary();
	}

}