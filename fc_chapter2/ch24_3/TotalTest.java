package ch24_3;

public class TotalTest {

	public static void main(String[] args) {

		Student kang = new Student(1001 , "Kang");
		Student kim = new Student(1002 , "Kim");
		Student lee = new Student(1003 , "Lee");
		
		kang.addSubject("����", 95);
		kang.addSubject("����", 90);
		kang.addSubject("����", 85);
		
		kim.addSubject("����", 88);
		kim.addSubject("����", 90);
		kim.addSubject("����", 78);
		
		lee.addSubject("����", 77);
		lee.addSubject("�ѱ���", 90);
		lee.addSubject("����", 70);
		
		kang.showInfo();
		System.out.println("==========================");
		kim.showInfo();
		System.out.println("==========================");
		lee.showInfo();
	
	}

}
