package ch14_FileIOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTwo {

	public static void main(String[] args) {

		int i;
		try(FileInputStream fis = new FileInputStream("input.txt")) { 
			//resource 안에 넣으면 autoclose 됨
			while((i = fis.read()) > -1) {
				// read()는 다음 바이트 데이터 또는 -1에 도달하면 리턴
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
