package ch09abstract;

public class ComputerTest {

	public static void main(String[] args) {

//		추상클래스는 new생성자로 사용 불가능
		
		Computer desktop = new Desktop();
//		Computer computer = new Computer(); // 에러
		
		desktop.display();
		
		
	}

}
