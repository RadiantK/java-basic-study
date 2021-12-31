package ex12_iterator;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	
	String name;
	int ban;
	int num;
	
	public Student(String name, int ban, int num) {
		this.name = name;
		this.ban = ban;
		this.num = num;
	}
}

public class GenericsIteratorTest {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("대조영", 1, 1));
		list.add(new Student("홍길동", 1, 2));
		list.add(new Student("장보고", 2, 1));
		
//		Iterator it = list.iterator();	
//		while(it.hasNext()) {
//			Student s = (Student)it.next();
//			System.out.println(s.name);
//		}
		
		Iterator<Student> it = list.iterator();	
		while(it.hasNext()) {
//			Student s = it.next();
			System.out.println(it.next().name);
		}
		
	}

}
