package ch15_2;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("����1");
		bookQueue.enQueue("����2");
		bookQueue.enQueue("����3");
		bookQueue.enQueue("����4");
		bookQueue.enQueue("����5");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue()); // 0��° �ε��� ����
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.getSize());
		
	}

}
