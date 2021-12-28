package ex7_casting2;

//import java.util.Arrays;

class Product {
	int price;
	int bonuspoint;
	
	public Product(int price) {
		this.price = price;
		bonuspoint = (int)(price/10);
	}
	
}

class Com extends Product {

	public Com() {
		super(100);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Computer";
	}
	
}

class  Tv extends Product {

	int price;
	
	public Tv(int price) {
		super(price);
		this.price = price;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "TV";
	}
	
}

class Audio extends Product {
	
	public Audio() {
		super(150);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonuspoint= 0;
	Product[] cart = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price ) {
			System.out.println("���� ���ڶ��ϴ�.");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		cart[i++] = p;
//		System.out.println(Arrays.toString(cart));
		System.out.println( p +" �� �����ϼ˽��ϴ�.");
	}
	
	void summry() {
		int sum=0;
		String temp = "";
		
		for(int i=0; i<cart.length; i++) {
			if( cart[i]==null) {
				break;
			}
			sum += cart[i].price;
			temp += cart[i] + " / ";		
		}
		System.out.println("�Ѿ�: " + sum);
		System.out.println("�����Ѱ�: "+temp);
		
	}
}

public class Casting2 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv t = new Tv(500);
		Com c = new Com();
		Audio a = new Audio();
		
		// Product p = new TV();
		// b.buy(p);
		b.buy(t);
		b.buy(c);
		b.buy(a);
		b.summry();
		
		System.out.println("������ = "+ b.money);
		System.out.println("���ʽ�����Ʈ = "+ b.bonuspoint);
	}

}
