package ch14_FileIOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamThree {

	public static void main(String[] args) {

		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")) { 
			//resource 안에 넣으면 autoclose 됨
			byte[] bs = new byte[10];
			
			while((i= fis.read(bs)) != -1) {
				// read()값이 -1이 되면 파일내용이 끝난거
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
			}
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
/*		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")) { 
			//resource 안에 넣으면 autoclose 됨
			byte[] bs = new byte[10];
			
			while((i= fis.read(bs, 1, 9)) != -1) {
				// read()값이 -1이 되면 파일내용이 끝난거
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
			}
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		*/
	}

}
