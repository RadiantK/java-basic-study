package ex9_equals;

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	// Object�� equals()�� �������̵� �ؼ� �ּҰ� �ƴ� value�� ��	
	@Override
	public boolean equals(Object obj) {	
		// ���������� ����ȯ ������ �ݵ�� instanceof�� Ȯ���ؾ���
		if (obj instanceof Value) {
		Value v = (Value)obj; // obj�� value�� ����ȯ.		
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
			System.out.println("v1�� v2�� �����ϴ�.");
		}
		else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
	}

}
