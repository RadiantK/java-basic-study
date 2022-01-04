package test;

class Product {
	int price;
	
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	
	Tv() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	
	Computer() {
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product {
	
	Audio() {
		super(150);
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
		if( money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
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
		cart[i++] = p ;
	}
	void summary() {
		int sum =0;
		String temp = "";
		for (int i=0; i<cart.length; i++) {
			if(cart[i] == null) {
				break;
			}
			sum += cart[i].price;
			temp += cart[i] + ", ";
		}
		System.out.println("�Ѿ�: " + sum);
		System.out.println("������ �͵�: " + temp);
		System.out.println("���� ��: " + money);
	}
}

public class Test {

	public static void main(String[] args) throws Exception {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();

	}

}
