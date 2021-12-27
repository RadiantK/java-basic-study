package ch09_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

/*		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}
		System.out.println("end");
		ex1 */
		
		// auto closeable
		try (FileInputStream fis = new FileInputStream("a.txt")){
			
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
