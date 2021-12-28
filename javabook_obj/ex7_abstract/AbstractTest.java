package ex7_abstract;

abstract class Player { // �̿ϼ� Ŭ����, �̿ϼ� ���赵
	
	abstract void play(int pos); // �߻�޼���(�����ΰ� ���� �޼���)
	abstract void stop();
}

class AudioPlayer extends Player {
	@Override
	void play(int pos) {
		System.out.println(pos +"��ġ���� �÷����մϴ�.");
	}
	@Override
	void stop() {
		System.out.println("����� ����ϴ�.");
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
