package ch03LinkedList;

public class MyLinkedListTest {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		
		list.addElement("A");
		list.addElement("Q");
		list.addElement("X");
		list.printAll();
		
		list.insertElement(1, "P");
		list.printAll();
		
		list.removeElement(2);
		list.printAll();
		
		System.out.println(list.getNode(1));
		System.out.println(list.getSize());
		
		list.removeAll();
		list.printAll();
		
	}

}
