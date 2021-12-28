package ch14;

public class CalculatorTest {

	public static void main(String[] args) {

		CompletCalc calc = new CompletCalc();
		
		int num1 = 20;
		int num2 = 4;
		
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.sub(num1, num2));
		System.out.println(calc.mul(num1, num2));
		System.out.println(calc.div(num1, num2));
		calc.showInfo();
		
		calc.description();
		
//		static메서드기때문에 new생성자의 인스턴스 생성에 영향을 받지않음
//		인터페이스 이름으로 호출해서 바로 쓸 수 있음.
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(Calc.total(arr));
		
	}

}
