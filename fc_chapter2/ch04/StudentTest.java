package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentKang = new Student();
		
		studentKang.studentID = 1234;
		studentKang.setStudentName("Kang");
		studentKang.address = "���� ���α�";
		
		studentKang.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 4321;
		studentKim.studentName = "Kim";
		studentKim.address = "���� ������";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKang);
		System.out.println(studentKim);
	}

}
