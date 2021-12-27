package ch14_FileIOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTwo {

	public static void main(String[] args) {

		int i;
		try(FileInputStream fis = new FileInputStream("input.txt")) { 
			//resource �ȿ� ������ autoclose ��
			while((i = fis.read()) > -1) {
				// read()�� ���� ����Ʈ ������ �Ǵ� -1�� �����ϸ� ����
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
