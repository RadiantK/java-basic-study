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
		
//		static�޼���⶧���� new�������� �ν��Ͻ� ������ ������ ��������
//		�������̽� �̸����� ȣ���ؼ� �ٷ� �� �� ����.
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(Calc.total(arr));
		
	}

}
