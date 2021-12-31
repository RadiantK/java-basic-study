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

	// equals()와 HashCode()를 오버라이딩 하지 않으면 중복이 제거되지않음
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		// this(나 자신)의 이름과 나이를 p와 비교
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
		// int hash(Object... values); // 가변인자 변수 개수 상관없음
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
