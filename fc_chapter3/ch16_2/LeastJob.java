package ch16_2;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��Ⱑ ���� ������ �켱���� ȣ���մϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");
	}

}
