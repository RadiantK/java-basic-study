package ch24_3;

public class TotalTest {

	public static void main(String[] args) {

		Student kang = new Student(1001 , "Kang");
		Student kim = new Student(1002 , "Kim");
		Student lee = new Student(1003 , "Lee");
		
		kang.addSubject("국어", 95);
		kang.addSubject("영어", 90);
		kang.addSubject("과학", 85);
		
		kim.addSubject("국어", 88);
		kim.addSubject("수학", 90);
		kim.addSubject("과학", 78);
		
		lee.addSubject("국어", 77);
		lee.addSubject("한국사", 90);
		lee.addSubject("도덕", 70);
		
		kang.showInfo();
		System.out.println("==========================");
		kim.showInfo();
		System.out.println("==========================");
		lee.showInfo();
	
	}

}
