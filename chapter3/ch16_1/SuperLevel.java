package ch16_1;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("��û �����Ԥ��޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� jump �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("turn �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** ����� �����Դϴ�. ******");
	}

}
