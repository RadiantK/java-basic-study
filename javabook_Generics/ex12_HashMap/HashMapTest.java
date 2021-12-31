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
	
		map.put("장보고", new Student("장보고", 1, 1, 100, 100, 100));
		
//		Student s = (Student)map.get();
		Student s = map.get("장보고");
		
		System.out.println(map);
	}

}
