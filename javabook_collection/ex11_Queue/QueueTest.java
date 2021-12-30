 package ex11_Queue;

import java.util.*;

@SuppressWarnings("rawtypes")
public class QueueTest {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // ť�� �ִ� 5�������� ����ǵ��� ��

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.print(">>");
			try {
				//ȭ�����κ��� ����(���ڿ�) ������ �Է¹���
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				
				// �Է��� ���ڿ��̸� �ݺ����� ó������ ���ư�
				if("".equals(input)) {
					continue;  
				} else if (input.equalsIgnoreCase("q")){ // ��ҹ��� �������ϰ� ��
					System.exit(0); // ���α׷� ����
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE +"�� �����ݴϴ�.");		
				} else if(input.equalsIgnoreCase("history")) {
					save(input); // �Է¹��� ��ɾ� ����
					
					// Queue�� �⺻ �޼��尡 �ʹ����� get()�� �������ؼ� ����ȯ
					// �������� Ÿ���� Queue���� ���� ��ü�� LinkedList
					// Queue q = new LinkedList();
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					// size�� �ݺ����� �������� ȣ���ϹǷ� ��������� �ٲ���
					for(int i=0; i< SIZE; i++) {
						System.out.println((i+1)+"."+list.get(i));
					}
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch( Exception e) {
				System.out.println("�Է� �����Դϴ�.");
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void save(String input) {
		// �Է��� ���ڿ��� �ƴϸ� Queue�� ����
		if(!"".equals(input)) { // if(input!=null && !input.equals(""))
			q.offer(input);
		}
		
		// �ִ� ������(5)�� ������ ó������� ���ڿ� ����
		if(q.size() > MAX_SIZE) {
			q.poll();
		}
	}
	

}

