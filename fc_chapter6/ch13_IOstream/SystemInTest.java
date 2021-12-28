package ch13_IOstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("���ĺ� ���� ���� ���� [Enter]Ű�� ��������.");
		
		int i;
		
		try {
			// InputStreamReader ����Ʈ�� ���ڷ� �ٲ���
			InputStreamReader irs = new InputStreamReader(System.in);
			
			while((i = irs.read()) != '\n') {
				//System.out.println(i);
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
