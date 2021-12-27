 package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student2 std1 = new Student2(100, "Kang");
		Student2 std2 = new Student2(100, "Kang");
//		Student std3 = std1; // 주소값만 복사
//		
		System.out.println(std1 == std2); // 다른 객체이기때문에 false
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		// 진짜 hash code 값
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		// 인스턴스 상태를 그대로 복제
		std1.setStudent2Name("Kim");
		Student2 copyStudent = (Student2)std1.clone();
		System.out.println(copyStudent);
		
		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
//		Integer i = 100;
//		System.out.println(i.hashCode());
	}

}
