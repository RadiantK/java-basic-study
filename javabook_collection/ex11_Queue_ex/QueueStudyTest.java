package ex11_Queue_ex;

import java.util.*;

public class QueueStudyTest {

	@SuppressWarnings("rawtypes")
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	@SuppressWarnings("unchecked")
	public static void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		} 
		if (q.size() > MAX_SIZE) {
			q.poll();
		}
	}
	@SuppressWarnings({ "rawtypes", "resource" })
	public static void main(String[] args) {

		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.print(">> ");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				
				if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ 5�� �����ݴϴ�.");
				} else if ("".equals(input)) {
					continue;
				} else if (input.equalsIgnoreCase("q")) {
					System.out.println("���α׷� ����");
					System.exit(MAX_SIZE);
				} else if (input.equalsIgnoreCase("history")) {
					save(input);
					
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					for(int i=0; i<SIZE; i++) {
						System.out.println((i+1)+"."+list.get(i));
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
