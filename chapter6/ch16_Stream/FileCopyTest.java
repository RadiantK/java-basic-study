package ch16_Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		
//		try(FileInputStream fis = new FileInputStream("a.zip"); 
//				FileOutputStream fos = new FileOutputStream("copy.zip")) {
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip")); 
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while( (i = bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println(millisecond + "소요되었습니다.");
		
		
		
		// Socket socket = new Socket();
		// BufferedReader br = new BufferedReader(new InputStreamReader(newsocket.getInputStream()));
		// br.readLine();
		
		
	}

}
