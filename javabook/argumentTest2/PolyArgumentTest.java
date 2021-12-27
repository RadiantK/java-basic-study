package argumentTest2;

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

class Audio extends Product {
	
	Audio() {
		super(300);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money=1000;
	int bonusPoint;
	Product[] item = new Product[10];
	int i = 0;
	
	
	void Buy(Product pro) {
		if(money< pro.price) {
			System.out.println("�ܾ��� ���ڸ��ϴ�. ������ �� �����ϴ�.");
			return;
		}
		money -= pro.price;
		bonusPoint += pro.bonuspoint;
		item[i++] = pro;
		System.out.println(pro + "�� �����߽��ϴ�.");
	}
	
	void summury() {
		int sum = 0;
		String temp="";
		
		for(int i=0; i<item.length; i++) {
			if (item[i] == null) {
				break;
			}
			sum += item[i].price;
			temp += item[i]+ " , ";

		}
		System.out.println("�Ѿ� :" + sum);
		System.out.println("�����Ѱ͵� :" + temp);
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio au = new Audio();
		
		b.Buy(tv);
		b.Buy(com);
		b.Buy(au);
		b.summury();
		
	}

}
