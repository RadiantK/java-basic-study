package ex14_StreamOperator;

import java.util.Comparator;
import java.util.stream.Stream;

class Student implements Comparable<Student> {

	String name;
	int ban;
	int total;
	
	public Student(String name, int ban, int total) {
		this.name = name;
		this.ban = ban;
		this.total = total;
	}
	
	public String toString() {
		return name +" "+ ban +" "+ total;
	}
	
	// ������ �������� (�⺻����)
	@Override
	public int compareTo(Student s) {
		return this.total - s.total;
	}

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotal() {
		return total;
	}
	
}

public class MiddleOperatorStreamTest2 {

	public static void main(String[] args) {

		Stream<Student> studentStream = Stream.of(
				new Student("���ڹ�", 3, 300),
				new Student("���ڹ�", 1, 160),
				new Student("���ڹ�", 4, 190),
				new Student("���ڹ�", 5, 170),
				new Student("���ڹ�", 1, 250),
				new Student("Ȳ�ڹ�", 2, 230),		
				new Student("���ڹ�", 2, 400)	
				);
		
		// 1. �ݺ����� , 2. ���� �������� ����
		studentStream.sorted(
				Comparator.comparing((Student s) -> s.getBan())
				.thenComparing(Comparator.naturalOrder()))
				.forEach((i) -> System.out.println(i));
		
	}

}
