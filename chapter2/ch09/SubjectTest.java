package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentK = new Student(1234, "Kang");
		studentK.setKoreaSubject("국어", 95);
		studentK.setMathSubject("수학", 89);
		
		Student studentM = new Student(4321, "Min");
		studentM.setKoreaSubject("국어", 77);
		studentM.setMathSubject("수학", 61);
		
		studentK.showScore();
		studentM.showScore();
	}

}
