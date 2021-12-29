package ex_8_Exception2;

import java.io.File;
import java.io.IOException;

public class ExceptionTest3 {

	public static void main(String[] args) {

			File f = createFile(""); // ���� ����
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		
	}
	
	static File createFile(String fileName) { // throws Exception {
		try {
			if(fileName == null || fileName.equals("")) {
				throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");
			}
		} catch(Exception e) {
			fileName = "test2.txt"; // �����̸��� ��� ���ܰ� �߻��ϸ� ���� �̸��� ������
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
