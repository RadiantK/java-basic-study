package ch24_2;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student studentKang = new Student(1001, "Kang");
		Student studentKim = new Student(1002, "Kim");
		
		studentKang.addSubject("국어", 85);
		studentKang.addSubject("수학", 88);
		studentKang.addSubject("영어", 100);
		
		studentKim.addSubject("국어", 85);
		studentKim.addSubject("수학", 89);
		studentKim.addSubject("영어", 98);
		
		studentKang.showInfo();
		System.out.println("===============================");
		studentKim.showInfo();
	}

}
