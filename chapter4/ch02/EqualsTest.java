 package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student2 std1 = new Student2(100, "Kang");
		Student2 std2 = new Student2(100, "Kang");
//		Student std3 = std1; // �ּҰ��� ����
//		
		System.out.println(std1 == std2); // �ٸ� ��ü�̱⶧���� false
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		// ��¥ hash code ��
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		// �ν��Ͻ� ���¸� �״�� ����
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
