package ch11Interface;
// 타입상속 CompletCalc는 Calc(인터페이스) 타입이다.
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
		System.out.println("모두 구현했습니다.");
	}

}
