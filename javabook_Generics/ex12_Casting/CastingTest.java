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

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {

		Box b = null;
		Box<String> bStr = null;
		
//		b = (Box)bStr; // Box<String> -> Box �������ѵ� ���
//		bStr = (Box<String>)b; // Box -> Box<String> ���������� ���
	}

}
