package ch15_2;

public interface Queue {
	
	// å�� ����
	void enQueue(String title);
	
	// å ��ȯ�� �޼���
	String deQueue();
	
	// Queue����
	int getSize();
}
