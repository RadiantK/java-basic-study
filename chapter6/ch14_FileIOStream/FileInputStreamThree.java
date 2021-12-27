package ch14_FileIOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamThree {

	public static void main(String[] args) {

		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")) { 
			//resource �ȿ� ������ autoclose ��
			byte[] bs = new byte[10];
			
			while((i= fis.read(bs)) != -1) {
				// read()���� -1�� �Ǹ� ���ϳ����� ������
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "����Ʈ ����");
			}
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
/*		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")) { 
			//resource �ȿ� ������ autoclose ��
			byte[] bs = new byte[10];
			
			while((i= fis.read(bs, 1, 9)) != -1) {
				// read()���� -1�� �Ǹ� ���ϳ����� ������
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "����Ʈ ����");
			}
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		*/
	}

}
