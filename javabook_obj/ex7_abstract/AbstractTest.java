package ex7_abstract;

abstract class Player { // 미완성 클래스, 미완성 설계도
	
	abstract void play(int pos); // 추상메서드(구현부가 없는 메서드)
	abstract void stop();
}

class AudioPlayer extends Player {
	@Override
	void play(int pos) {
		System.out.println(pos +"위치부터 플레이합니다.");
	}
	@Override
	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
	
}

public class AbstractTest {

	public static void main(String[] args) {

//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
	}

}
