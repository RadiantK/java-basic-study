package ch16_2;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("�켱 ������ ���� ���켱���� ���õ� ���� ������ ȣ���մϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");
	}

}
