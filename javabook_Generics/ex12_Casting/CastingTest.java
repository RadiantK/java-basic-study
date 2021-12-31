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

public class CastingTest {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {

		Box b = null;
		Box<String> bStr = null;
		
//		b = (Box)bStr; // Box<String> -> Box 가능은한데 경고
//		bStr = (Box<String>)b; // Box -> Box<String> 가능하지만 경고
	}

}
