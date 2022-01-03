package ex14_lamda;

@FunctionalInterface
interface MyFunction222 {
	public abstract int max(int a, int b);
}

public class LamdaTest {

	public static void main(String[] args) {

		// 람다식은 익명 개체이기 때문에 다루기위한 참조변수 타입은 함수형 인터페이스로 한다.
		MyFunction222 mf = (a, b) ->  a > b ? a : b;
		
		int value = mf.max(5, 3);
		System.out.println(value);
		
	}

}
