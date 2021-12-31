package ex12_HashMap;

import java.util.HashMap;

class Student {
	
	String name;
	int ban;
	int num;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int num, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;	
	}
}

public class HashMapTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		HashMap<String, Student> map = new HashMap<>(); // key:String, value:Student
	
		map.put("�庸��", new Student("�庸��", 1, 1, 100, 100, 100));
		
//		Student s = (Student)map.get();
		Student s = map.get("�庸��");
		
		System.out.println(map);
	}

}
