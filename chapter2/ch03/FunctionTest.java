package ch03;

public class FunctionTest {

	public static int addNum(int a, int b) {
		
		int result;
		result = a + b;
		return result;
	}
	
	public static void sayHello(String greeting) {
		
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		
		int sum = 0;
		int i;
		for (i=0; i<=100; i++) {
			sum +=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int a = 5;
		int b = 15;
		
		int total = addNum(a, b);
		System.out.println(total);
		
		sayHello("¾È³çÇÏ¼¼¿ä");
		
		total = calcSum();
		System.out.println(total);
	}

}
