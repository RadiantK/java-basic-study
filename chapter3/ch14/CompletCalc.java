package ch14;

public class CompletCalc extends Calculator{

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("모두 구현했습니다.");
	}
	
	// 재정의 하지 않으면 myMethod 출력
//	@Override
//	public void description() {
//		System.out.println("CompletCalc Overriding");
//	}
	
	
}
