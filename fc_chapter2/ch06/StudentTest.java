package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentKang = new Student();
		
		System.out.println(studentKang.showStudentInfo());
		
		Student studentKim = new Student(1234, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}

}
