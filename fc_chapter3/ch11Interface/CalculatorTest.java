package ch11Interface;

public class CalculatorTest {

	public static void main(String[] args) {

//		Calc calc = new CompletCalc(); // showInfo 사용 불가능
		CompletCalc calc = new CompletCalc();
		
		int num1 = 17;
		int num2 = 2;
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.sub(num1, num2));
		System.out.println(calc.mul(num1, num2));
		System.out.println(calc.div(num1, num2));
		
		calc.showInfo();
	}

}
