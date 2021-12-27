package ch09_Exception;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class<?> loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		
		// throw (�ڵ鸵)ó���� �̷�� �޼��带 ���� �ʿ��� ó���ϰڴ�
//		FileInputStream fis = new FileInputStream(fileName);
		
		Class<?> c = Class.forName(className);
		
		return c;
	}
	
	
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		// main���� throw�ϸ� VM���ΰ� ��������
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			// �ֻ��� Exception �������� �ȵǰ� ���ϴܿ� 
		}
		
		System.out.println("end");
	}

}
