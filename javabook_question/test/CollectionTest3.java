package test;

import java.util.*;

class Student {
	String name;
	int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class CollectionTest3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		TreeMap<String, Student> map = new TreeMap<>();
		
		map.put("1-1" ,new Student("������", 100));
		map.put("1-2" ,new Student("�̼���", 96));
		map.put("1-3" ,new Student("�庸��", 88));
		map.put("1-4" ,new Student("������", 87));
		
//		Set set = map.keySet();
//		
//		System.out.println(set);
//		
//		Collection value = map.values();
//		
//		System.out.println(value);
		
			
//		Iterator it = map.entrySet().iterator();
		Set set = map.entrySet();
//		System.out.println(set);
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.print("key : " + e.getKey()+ " / ");
			System.out.println(((Student)e.getValue()).name + ", " + ((Student)e.getValue()).score);

		}
		
//		int total =0;
//		
//		Iterator it = map.values().iterator();
//		
//		while(it.hasNext()) {
//			total += it.next();
//		}
//		System.out.println("���� : "+ total);
		
	}

}
