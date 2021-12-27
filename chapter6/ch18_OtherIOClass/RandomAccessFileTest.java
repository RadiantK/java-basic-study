package ch18_OtherIOClass;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100); /// int 4byte
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeDouble(3.14); // double 8byte
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���"); // �ѱ��� ���ڴ� 3byte�� �������� ���ڿ��� null(2byte)�� ����
		System.out.println("pos: " + rf.getFilePointer());
		
		rf.seek(0); // �����͸� �Ǿ����� �̵�
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
