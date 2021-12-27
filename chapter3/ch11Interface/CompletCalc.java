package ch11Interface;
// Ÿ�Ի�� CompletCalc�� Calc(�������̽�) Ÿ���̴�.
public class CompletCalc extends Calculator {

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if (num2 == 0) {
			return ERROR;
		}
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("��� �����߽��ϴ�.");
	}

}
