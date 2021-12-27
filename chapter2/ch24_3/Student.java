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
			System.out.println("���̵�" + studentID + "�� " +studentName + "�л��� " + subject.getName() + " ���� ������ " + subject.getScore() + "�� �Դϴ�.");		
		}
		System.out.println(studentName + "�л��� ������ " + total + "�� �Դϴ�.");
	}
	
}
