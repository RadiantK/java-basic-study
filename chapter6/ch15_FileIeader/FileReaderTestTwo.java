package ch15_FileIeader;

import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTestTwo {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt")) {
			
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);		
			fw.write("�ȳ��ϼ���. �� �����ϴ�.");
			fw.write(buf, 1, 2); // �迭�� �Ϻκ� ���
			fw.write("65");
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
