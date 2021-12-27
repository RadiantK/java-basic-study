package ch17_Serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Person1 implements Externalizable {
	
	String name;
	String job;
	// transient String job;
	// transient ����ȭ���� �������� �ν��Ͻ��� �� null���� ��
	
	public Person1() {
		
	}
	public Person1(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
	
	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		
		name = obj.readUTF();
		job = obj.readUTF();
	}
	
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		
		obj.writeUTF(name);
		obj.writeUTF(job);
	}
	
}


public class ExternalizableTest {

	public static void main(String[] args) {

		Person1 personK = new Person1("������", "��ǥ�̻�");
		Person1 personL = new Person1("�̼���", "��");
		
		// Serialization
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
			ObjectOutputStream ois = new ObjectOutputStream(fos)) {
			
			ois.writeObject(personK);
			ois.writeObject(personL);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
		// deSerialization
		try(FileInputStream fos = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)) {
				
			// ������ �о���� class�� ������ ��������
			// ClassNotFoundException ���ٰ�
			Person1 perK = (Person1)ois.readObject();
			Person1 perL = (Person1)ois.readObject();
			
			System.out.println(perK);
			System.out.println(perL);

			}catch(IOException e) {
				System.out.println(e);
			}catch(ClassNotFoundException e) {
				System.out.println(e);
			}
	}

}
