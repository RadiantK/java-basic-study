package ex14_optional;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
//		int[] arr = {};
//		int[] arr = null;
		int[] arr = new int[0];
		System.out.print("arr.length: " + arr.length);
		
//		Optional<String> opt = null; // OK 바람직하진 않음
//		Optional<String> opt = Optional.empty();
		Optional<String> opt = Optional.of("asdf");
		System.out.println("opt: "+opt);
//		System.out.println("opt: "+opt.get()); // 에러 
		
		String str = "";
		
//		try {
//			str = opt.get();
//		} catch (Exception e) {
//			str = ""; // 예외가 발생하면 빈문자열""로 초기화
//		} // 예외발생
//		System.out.println("str: "+str);
		
		str = opt.orElse("Empty"); // Optional에 저장된 값이 null이면 ""반환
//		str = opt.orElseGet(()->new String());
		str = opt.orElseGet(String::new);
		System.out.println("str: "+str);
	}
}
