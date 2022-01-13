package ex14_optional;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalTest2 {

	public static void main(String[] args) {

		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map((i)-> i.length()); // String::length
		System.out.println("optStr: " + optStr.get());
		System.out.println("optInt: " + optInt.get());
		
		int result1 = Optional.of("123").filter(x->x.length() > 0)
				.map(i-> Integer.parseInt(i)).get();
		System.out.println("result1: "+result1);
		
		int result2 = Optional.of("").filter(x->x.length()>0)
				.map(Integer::parseInt).orElse(-1);
		System.out.println("result2: "+result2);
		
		Optional.of("1234").map(s-> Integer.parseInt(s))
			.ifPresent(x->System.out.println("result: " + x));
		
		OptionalInt optInt1 = OptionalInt.of(0); // 0
		OptionalInt optInt2 = OptionalInt.empty(); // ºó°´Ã¼
		
		System.out.println(optInt1.isPresent()); // true
		System.out.println(optInt2.isPresent()); // false
		
		System.out.println(optInt1.getAsInt()); // 0
//		System.out.println(optInt2.getAsInt()); // NoSuchException
		System.out.println(optInt1);
		System.out.println(optInt2);
		
	}

}
