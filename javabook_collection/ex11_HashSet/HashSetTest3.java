package ex11_HashSet;

import java.util.HashSet;
import java.util.Objects;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + "  " + age;
	}

	// equals()�� HashCode()�� �������̵� ���� ������ �ߺ��� ���ŵ�������
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		// this(�� �ڽ�)�� �̸��� ���̸� p�� ��
		return this.name.equals(p.name) && this.age == p.age;
	}
//	public boolean equals(Object obj) {
//		if(obj instanceof Person) {
//			Person p = (Person)obj;
//			return this.name.equals(p.name) && this.age == p.age;
//		}
//		return false;
//	}
	
	@Override
	public int hashCode() {
		// int hash(Object... values); // �������� ���� ���� �������
		return Objects.hash(age, name);
	}
	
}

public class HashSetTest3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}

}
