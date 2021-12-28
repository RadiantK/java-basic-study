package ch14_FileIOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTestOne {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("output.txt")) {
			// ������ ������ ������ �������� �� �ڵ����� ����
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
