package ch24_2;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student studentKang = new Student(1001, "Kang");
		Student studentKim = new Student(1002, "Kim");
		
		studentKang.addSubject("����", 85);
		studentKang.addSubject("����", 88);
		studentKang.addSubject("����", 100);
		
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 89);
		studentKim.addSubject("����", 98);
		
		studentKang.showInfo();
		System.out.println("===============================");
		studentKim.showInfo();
	}

}
