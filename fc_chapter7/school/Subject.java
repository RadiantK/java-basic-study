package school;

import java.util.ArrayList;
import utils.Define;

public class Subject {

	private String subjectName; // 과목 이름
	private int subjectID; // 과목 번호
	private int gradeType; // 과목 평가 방법 기본은 A,B방식
	
	// register() 실행하면 리스트에 추가
	private ArrayList<Student> studentList = new ArrayList<>();
	
	
	public Subject(String subjectName, int subjectID) {
		this.subjectName = subjectName;
		this.subjectID = subjectID;
		this.gradeType = Define.AB_TYPE;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}
	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	
}
