package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

public class GenerateGradeReport {

	School school = School.getInstance();
	public static final String TITLE = " ������ ���� \t\t\n";
	public static final String HEADER = " �̸� | �й� | �������� | ����    \n";
	public static final String LINE = "-------------------------------------\n";
	private StringBuffer bf = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		// ��� ���� ���� ��������
		
		for( Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return bf.toString();
	}
	
	public void makeHeader(Subject subject) {
		bf.append(LINE);
		bf.append("\t" + subject.getSubjectName());
		bf.append(GenerateGradeReport.TITLE);
		bf.append(GenerateGradeReport.HEADER);
		bf.append(GenerateGradeReport.LINE);
	}
			
	public void makeBody(Subject subject) {
		
		ArrayList<Student> studentList = subject.getStudentList();
		// �� ������ �л���
		
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			bf.append(student.getStudentName());
			bf.append(" | ");
			bf.append(student.getStudentID());
			bf.append(" | ");
			bf.append(student.getMajorSubject().getSubjectName());
			bf.append(" | ");
			
			getScoreGrade(student, subject.getSubjectID());
			bf.append("\n");
			bf.append(LINE);
		}
			
	}
			
	public void makeFooter() {
		bf.append("\n");
	}
	
	public void getScoreGrade(Student student, int subjectID) {
		
		ArrayList<Score> scoreList = student.getScoreList();
		int majorID = student.getMajorSubject().getSubjectID();
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};
		
		for(int i=0; i<scoreList.size(); i++) {
			
			Score score = scoreList.get(i);
			if(score.getSubject().getSubjectID() == subjectID) { // ���� ������ ������ ����
				String grade;
				if(score.getSubject().getSubjectID() == majorID) { // ���� ������ ���
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				} else {
					grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				}
				bf.append(score.getPoint());
				bf.append(":");
				bf.append(grade);
				bf.append(" | ");
			}
		}
	}
		
}
