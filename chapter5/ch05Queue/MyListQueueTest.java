package ch05Queue;

public class MyListQueueTest {

	public static void main(String[] args) {
		
		MyLinkedQueue listQueue = new MyLinkedQueue();
		
		listQueue.enQueue("A");
		listQueue.enQueue("S");
		listQueue.enQueue("D");
		listQueue.enQueue("F");
		listQueue.enQueue("G");
		
		listQueue.printQueue();
		
		System.out.println("");
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
		
		System.out.println("");
		listQueue.printQueue();
	}

}
