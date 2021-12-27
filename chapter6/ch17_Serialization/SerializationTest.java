package ch17_Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Person implements Serializable {
	
	String name;
	String job;
	// transient String job;
	// transient 직렬화하지 않으려는 인스턴스에 씀 null값이 들어감
	
	public Person() {
		
	}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}


public class SerializationTest {
	
	public static void main(String[] args) {

		Person personK = new Person("강감찬", "대표이사");
		Person personL = new Person("이순신", "상무");
		
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
				
			// 읽을때 읽어들일 class가 있으면 에러가남
			//ClassNotFoundException 해줄것
			Person perK = (Person)ois.readObject();
			Person perL = (Person)ois.readObject();
			
			System.out.println(perK);
			System.out.println(perL);

			}catch(IOException e) {
				System.out.println(e);
			}catch(ClassNotFoundException e) {
				System.out.println(e);
			}
		
		
	}

}
