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
			System.out.println("돈이 모자랍니다.");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		cart[i++] = p;
//		System.out.println(Arrays.toString(cart));
		System.out.println( p +" 를 구매하셧습니다.");
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
		System.out.println("총액: " + sum);
		System.out.println("구매한것: "+temp);
		
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
		
		System.out.println("남은돈 = "+ b.money);
		System.out.println("보너스포인트 = "+ b.bonuspoint);
	}

}
