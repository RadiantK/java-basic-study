package ch11_Logger;

public class StudentTest {

	public static void main(String[] args) {
		
		MyLogger myLogger = MyLogger.getLogger();
		
		String name = null;
		
		try{
			@SuppressWarnings("unused")
			Student student = new Student(name);
			
		}catch( StudentNameFormatException e ){
			myLogger.warning(e.getMessage());
		}
		
		try{
			@SuppressWarnings("unused")
			Student student = new Student("Edward Jon Kim Test");
		}catch ( StudentNameFormatException e){
			myLogger.warning(e.getMessage());
		}
		
		Student student = new Student("James");
		
		student.getStudentName();

	}

}
