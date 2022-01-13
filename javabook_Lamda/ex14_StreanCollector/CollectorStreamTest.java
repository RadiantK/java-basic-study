package ex14_StreanCollector;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public boolean isMale() {
		return isMale;
	}

	public int getHak() {
		return hak;
	}

	public int getBan() {
		return ban;
	}

	public int getScore() {
		return score;
	}
	
	public String toString() {
		return String.format("[%s, %s, %d학년 %d반, %3d점]",
				name, isMale ? "남" : "여", hak, ban, score);
	}
	enum Level { HIGH, MID, LOW }
}

public class CollectorStreamTest {

	public static void main(String[] args) {

		Student[] stuArr = {
				new Student("김자바", true, 1, 1, 300),
				new Student("이자바", false, 2, 1, 200),
				new Student("박자바", true, 1, 2, 100),
				new Student("나자바", false, 2, 1, 100),
				new Student("최자바", false, 2, 1, 200),
				new Student("황자바", true, 1, 2, 150),
				new Student("홍자바", false, 1, 3, 120),
				new Student("안자바", true, 1, 3, 150),
		};
		
		System.out.printf("1. 단순분할(성별로 분할)%n");
		Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy((Student s) -> s.isMale == true ));
		//partitioningBy(Student::isMale)

		List<Student> maleStudent = stuBySex.get(true);
		List<Student> femaleStudent = stuBySex.get(false);

		for(Student s : maleStudent) {
			System.out.println(s);
		}
		for(Student s : femaleStudent) {
			System.out.println(s);
		}

		System.out.printf("%n2. 단순분할 + 통계(성별 학생수)%n");
		Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student::isMale, Collectors.counting())) ;

//		Student::isMale, Collectors.counting()
		System.out.println("남학생 수 :"+ stuNumBySex.get(true));
		System.out.println("여학생 수 :"+ stuNumBySex.get(false));


		System.out.printf("%n3. 단순분할 + 통계(성별 1등)%n");
		Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student::isMale, 
						Collectors.maxBy(Comparator.comparingInt(Student::getScore)) //(Student s) -> s.getScore()
				));
		System.out.println("남학생 1등 :"+ topScoreBySex.get(true));
		System.out.println("여학생 1등 :"+ topScoreBySex.get(false));

		Map<Boolean, Student> topScoreBySex2 = Stream.of(stuArr)
			.collect(Collectors.partitioningBy(Student::isMale, 
					Collectors.collectingAndThen(
					Collectors.maxBy(Comparator.comparingInt(Student::getScore)), Optional::get
				)
			));
		System.out.println("남학생 1등 :"+ topScoreBySex2.get(true));
		System.out.println("여학생 1등 :"+ topScoreBySex2.get(false));

		System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");

		Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = 
			Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale, 
					Collectors.partitioningBy(s -> s.getScore() <= 100))
			); 
		List<Student> failedMaleStu   = failedStuBySex.get(true).get(true);
		List<Student> failedFemaleStu = failedStuBySex.get(false).get(true);

		for(Student s : failedMaleStu) {
			System.out.println(s);
		}
		for(Student s : failedFemaleStu) {
			System.out.println(s);
		}
	}
}
