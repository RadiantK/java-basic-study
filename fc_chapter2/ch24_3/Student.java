package ch24_3;

import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	ArrayList<Subject> subjectList = new ArrayList<>();
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	public void showInfo() {
		
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println("아이디가" + studentID + "인 " +studentName + "학생의 " + subject.getName() + " 과목 성적은 " + subject.getScore() + "점 입니다.");		
		}
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
