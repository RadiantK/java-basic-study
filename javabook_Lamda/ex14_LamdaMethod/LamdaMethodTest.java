package ex14_LamdaMethod;

import java.util.function.*;

public class LamdaMethodTest {

	public static void main(String[] args) {

		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		Function<String, Integer> f2 = Integer::parseInt; // 메소드참조=클래스이름::메소드이름
		
		System.out.println(f.apply("100")+100);
		System.out.println(f2.apply("200")+200);
	}

}
