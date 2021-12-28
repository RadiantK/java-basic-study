package ch03LinkedList;

public class MyListNode {

	private String data; // 자료
	public MyListNode next; // 다음 노드
	
	public MyListNode() {
		data = null;
		next = null;
	}
	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	public MyListNode(String data, MyListNode link) {
		this.data = data;
		this.next = link;
	}
	public String getData() {
		return data;
	}
	
	
}
