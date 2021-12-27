package ch15_FileIeader;

import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTestTwo {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt")) {
			
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);		
			fw.write("안녕하세요. 잘 써집니다.");
			fw.write(buf, 1, 2); // 배열의 일부분 출력
			fw.write("65");
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
