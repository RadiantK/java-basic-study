package ex9_equals;

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	// Object의 equals()를 오버라이딩 해서 주소가 아닌 value를 비교	
	@Override
	public boolean equals(Object obj) {	
		// 참조변수의 형변환 전에는 반드시 instanceof로 확인해야함
		if (obj instanceof Value) {
		Value v = (Value)obj; // obj를 value로 형변환.		
		return this.value == v.value;
		}
		return false;
	}
}

public class EqualsTest {

	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}
		else {
			System.out.println("v1과 v2는 다릅니다.");
		}
	}

}
