package ex_9_NumberTest;

public class NumberTest {

	public static void main(String[] args) {

//		int i = Integer.parseInt("100");
		System.out.println("i= "+Integer.parseInt("100"));
		System.out.println("i= "+Integer.parseInt("100", 10)); // 위와 동일
		System.out.println("i= "+Integer.parseInt("100", 2)); // 2진수
		System.out.println("i= "+Integer.parseInt("FF", 16)); // 16진수
		
	}

}
