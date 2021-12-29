package ex_8_Exception2;

import java.io.File;
import java.io.IOException;

public class ExceptionTest3 {

	public static void main(String[] args) {

			File f = createFile(""); // 파일 생성
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		
	}
	
	static File createFile(String fileName) { // throws Exception {
		try {
			if(fileName == null || fileName.equals("")) {
				throw new Exception("파일 이름이 유효하지 않습니다.");
			}
		} catch(Exception e) {
			fileName = "test2.txt"; // 파일이름이 없어서 예외가 발생하면 파일 이름을 정해줌
		}
		File f = new File(fileName);
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
		
	}

}
