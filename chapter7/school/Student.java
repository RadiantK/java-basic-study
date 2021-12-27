package school;

import java.util.ArrayList;

public class Student {

	private int studentID; // 학번
	private String studentName; // 이름
	private Subject majorSubject; // 필수 과목
	
	// 과목점수를 담음 addSubjectScore
	private ArrayList<Score> scoreList = new ArrayList<>();
	
	public Student(int studentID, String studentName, Subject majorSubject) {
		
		this.studentID = studentID;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}
	
	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
}
