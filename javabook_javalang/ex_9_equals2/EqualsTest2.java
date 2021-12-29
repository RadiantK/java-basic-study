package ex_9_equals2;

class Person {
	long id;
	
	Person(long id) {
		this.id = id;
	}
	
//	public boolean equals(Object obj) {
//		if(obj instanceof Person) {
//			Person p = (Person)obj;
//			return this.id == p.id;
//		}
//		return false;
//	}
	
	public boolean equals(Object obj) {
	if(!(obj instanceof Person)) {
		return false;	
	}
	Person p = (Person)obj;
	return this.id == p.id;
	}
	
}

public class EqualsTest2 {

	public static void main(String[] args) {

		Person p1 = new Person(4054541111222L);
		Person p2 = new Person(4054541111222L);
		
		if(p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}
		else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
	}

}
