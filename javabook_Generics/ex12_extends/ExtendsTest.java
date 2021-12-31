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

// 제네릭 다이아몬드박스 안에서는 콤마를 쓰지않고 & 사용 Eatable은 안써도됌
// 타입은 Fruit클래스를 상속하고 Eatable인터페이스도 구현해야함
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>(); // 아이템을 저장할 리스트
	
	void add(T item)  {	// 박스에 아이템 추가
		list.add(item);
	}
	T get(int i) { // 박스에서 아이템을 꺼낼 때
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
//		fruitBox.add(new Toy)()); // 토이는 상속관계아님
		
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); // 같은 자손관계라서 안됨
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); // 조상요소가 없음

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}
