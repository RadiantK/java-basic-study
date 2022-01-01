package ex11_Queue_ex;

import java.util.*;

@SuppressWarnings("rawtypes")
public class QueueStudyTest {
		
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	@SuppressWarnings("unchecked")
	static void save(String input) {
		if(input!=null && !input.equals("")) {
			q.offer(input);
		} 
		if (q.size()>MAX_SIZE) {
			q.poll();
		}
	}

	public static void main(String[] args) {

		System.out.println("help�� �Է��ϸ� ������ Ȯ���� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.print(">>");
			
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine();
				
				if(input.equals("")) {
					continue;
				} else if (input.equalsIgnoreCase("q")) {
					System.out.println("���α׷� ���� !");
					System.exit(0);
					sc.close();
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help => ������ �����ݴϴ�.");
					System.out.println("q �Ǵ� Q => ���α׷��� �����մϴ�.");
					System.out.println("history => �ֱٿ� �Է��� ��ɾ� "+MAX_SIZE+"���� �ҷ��ɴϴ�.");
				} else if (input.equalsIgnoreCase("history")) {
					save(input);
					
					LinkedList ll = (LinkedList)q;
					
					final int SIZE = ll.size();
					for (int i=0; i<SIZE; i++) {
						System.out.println((i+1)+". "+ll.get(i));
					}
				} else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
