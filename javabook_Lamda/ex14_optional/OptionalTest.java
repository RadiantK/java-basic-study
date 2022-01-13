package ex14_optional;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
//		int[] arr = {};
//		int[] arr = null;
		int[] arr = new int[0];
		System.out.print("arr.length: " + arr.length);
		
//		Optional<String> opt = null; // OK �ٶ������� ����
//		Optional<String> opt = Optional.empty();
		Optional<String> opt = Optional.of("asdf");
		System.out.println("opt: "+opt);
//		System.out.println("opt: "+opt.get()); // ���� 
		
		String str = "";
		
//		try {
//			str = opt.get();
//		} catch (Exception e) {
//			str = ""; // ���ܰ� �߻��ϸ� ���ڿ�""�� �ʱ�ȭ
//		} // ���ܹ߻�
//		System.out.println("str: "+str);
		
		str = opt.orElse("Empty"); // Optional�� ����� ���� null�̸� ""��ȯ
//		str = opt.orElseGet(()->new String());
		str = opt.orElseGet(String::new);
		System.out.println("str: "+str);
	}
}
