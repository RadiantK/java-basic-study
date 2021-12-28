package ch24_2;

import java.util.ArrayList;

public class Student {

	String studentName;
	int studentId;
	
	ArrayList<Subject> subjectList = new ArrayList<>();
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubName(name);
		subject.setSubScore(score);
		
		subjectList.add(subject);
	}
	
	public void showInfo() {
		
		int total = 0;
		
		for( Subject subject : subjectList) {
			total += subject.getSubScore();
			System.out.println(studentName + "학생의" + subject.getSubName() + "과목의 성적은 " + subject.getSubScore() + "점 입니다.");
		}
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
}
