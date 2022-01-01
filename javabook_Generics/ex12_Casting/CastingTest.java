package ex12_Casting;

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

public class CastingTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//		�纯�� Ÿ���� �ȸ����Ƿ� ���� ���� ������ ����
//		FruitBox<? extends Fruit> box = (FruitBox<? extends Fruit>)new FruitBox<Fruit>();
		FruitBox<? extends Fruit> box = new FruitBox<Fruit>();
		FruitBox<? extends Apple> abox = new FruitBox<Apple>();
//		FruitBox<Apple> appleBox = (FruitBox<Apple>)abox; ���������� ���
	}

}
