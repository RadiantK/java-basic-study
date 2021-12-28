package ch09_Exception;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class<?> loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		
		// throw (핸들링)처리를 미루고 메서드를 쓰는 쪽에서 처리하겠다
//		FileInputStream fis = new FileInputStream(fileName);
		
		Class<?> c = Class.forName(className);
		
		return c;
	}
	
	
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		// main에서 throw하면 VM으로감 하지말것
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			// 최상위 Exception 위에쓰면 안되고 최하단에 
		}
		
		System.out.println("end");
	}

}
