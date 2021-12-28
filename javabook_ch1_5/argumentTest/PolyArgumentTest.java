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
			System.out.println("�ܾ��� ���ڸ��ϴ�. ������ �� �����ϴ�.");
			return;
		}
		money -= pro.price;
		bonusPoint += pro.bonuspoint;
		System.out.println(pro + "�� �����߽��ϴ�.");
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		b.Buy(tv);
		b.Buy(com);
		
		System.out.println("�����ϰ� ���� ���� " + b.money +"�Դϴ�.");
		System.out.println("���ʽ�����Ʈ " + b.bonusPoint +"�Դϴ�.");
	}

}
