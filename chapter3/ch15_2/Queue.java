package ch15_2;

public interface Queue {
	
	// 책이 들어옴
	void enQueue(String title);
	
	// 책 반환할 메서드
	String deQueue();
	
	// Queue개수
	int getSize();
}
