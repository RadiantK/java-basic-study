package ch02;

public class Student2 implements Cloneable{

	private int studentNum;
	private String studentName;
	
	public Student2(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public void setStudent2Name(String name) {
		this.studentName = name;
	}
	
	public String toString() {
		return studentNum + "," + studentName;
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student2) {
			Student2 std = (Student2)obj; 
			if(this.studentNum == std.studentNum) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
	
		return studentNum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}	
	
	
}
