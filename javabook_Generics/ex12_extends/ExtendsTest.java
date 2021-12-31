package ex12_extends;

import java.util.ArrayList;

interface Eatable {
	
}
class Fruit implements Eatable	{
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}
class Toy {
	public String toString() {
		return "Toy"  ;
	}
}

// ���׸� ���̾Ƹ��ڽ� �ȿ����� �޸��� �����ʰ� & ��� Eatable�� �Ƚᵵ��
// Ÿ���� FruitŬ������ ����ϰ� Eatable�������̽��� �����ؾ���
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>(); // �������� ������ ����Ʈ
	
	void add(T item)  {	// �ڽ��� ������ �߰�
		list.add(item);
	}
	T get(int i) { // �ڽ����� �������� ���� ��
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}

public class ExtendsTest {

	public static void main(String[] args) {

		Box<Fruit> fruitBox = new Box<>();
		Box<Apple> appleBox = new Box<>();
		Box<Toy> toyBox = new Box<>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Grape());
		fruitBox.add(new Apple());
//		fruitBox.add(new Toy)()); // ���̴� ��Ӱ���ƴ�
		
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); // ���� �ڼհ���� �ȵ�
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); // �����Ұ� ����

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}
