package ex_9_hashcode;

class Person {
	long id;
	
	Person(long id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return this.id == p.id;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (int) id;
	}
	
	
}
public class HashCodeTest {

	public static void main(String[] args) {

		Person p1 = new Person(4054541111222L);
		Person p2 = new Person(4054541111222L);
		
		if(p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}
		else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
	}

}
