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
	
	// 총점의 오름차순 (기본정렬)
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
				new Student("이자바", 3, 300),
				new Student("박자바", 1, 160),
				new Student("최자바", 4, 190),
				new Student("김자바", 5, 170),
				new Student("안자바", 1, 250),
				new Student("황자바", 2, 230),		
				new Student("심자바", 2, 400)	
				);
		
		// 1. 반별정렬 , 2. 총점 오름차순 정렬
		studentStream.sorted(
				Comparator.comparing((Student s) -> s.getBan())
				.thenComparing(Comparator.naturalOrder()))
				.forEach((i) -> System.out.println(i));
		
	}

}
