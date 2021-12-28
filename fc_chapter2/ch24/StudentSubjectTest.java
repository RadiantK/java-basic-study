package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		Student studentKim = new Student(1001, "Kim");
		
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);
		
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 100);
		
		studentLee.showInfo();
		System.out.println("==================");
		studentKim.showInfo();
	}

}
