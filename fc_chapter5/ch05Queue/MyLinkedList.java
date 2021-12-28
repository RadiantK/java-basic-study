package ch05Queue;

public class MyLinkedList {

	private MyListNode head; // �� ó�� �ڷ�
	int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {
		
		MyListNode newNode;
		if(head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		} else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {
		
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position<0 || position>count) {
			System.out.println("�߰� �� ��ġ ����. ���� ����Ʈ�� ������ "+count+"�� �Դϴ�.");
			return null;
		}
		if (position == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			MyListNode preNode = null;
			for(int i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;				
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	public MyListNode removeElement(int position) {
		
		MyListNode tempNode = head;
		
		if (position >= count || position<0) {
			System.out.println("������ ��ġ ����. ���� ����Ʈ�� ������ " +count+ "�� �Դϴ�.");
			return null;
		}
		if (position == 0) {
			head = tempNode.next; // head ������ head�� ��
		} else {
			MyListNode preNode = null;
			for (int i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "��° �׸� �����Ǿ����ϴ�.");
		
		return tempNode;
	}
	
	public String getElement(int position) {
		
		MyListNode tempNode = head;
		
		if (position >= count || position<0) {
			System.out.println("�˻� ��ġ ����. ���� ����Ʈ�� ������ " +count+ "�� �Դϴ�.");
			return new String("Error");
		}
		
		if(position == 0) {
			return head.getData();
		}
		
		for(int i = 0; i<position; i++) {
			tempNode = tempNode.next;
		}
		return tempNode.getData();
	}
	
	public MyListNode getNode(int position) {
		
		MyListNode tempNode = head;
		
		if (position >= count || position<0) {
			System.out.println("�˻� ��ġ ����. ���� ����Ʈ�� ������ " +count+ "�� �Դϴ�.");
			return null;
		}
		
		if(position == 0) {
			return head;
		}
		
		for(int i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
		
		
	}
	
	public void removeAll()	{
		head = null;
		count = 0;
		
	}
	
	public int getSize() {
		return count;
	}
	
	public void printAll() {
		if(count == 0){
			System.out.println("����� ������ �����ϴ�.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
	}

	
}
