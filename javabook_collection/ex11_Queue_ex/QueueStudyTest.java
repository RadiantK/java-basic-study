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

		System.out.println("help를 입력하면 도움말을 확인할 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine();
				
				if(input.equals("")) {
					continue;
				} else if (input.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료 !");
					System.exit(0);
					sc.close();
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help => 도움말을 보여줍니다.");
					System.out.println("q 또는 Q => 프로그램을 종료합니다.");
					System.out.println("history => 최근에 입력한 명령어 "+MAX_SIZE+"개를 불러옵니다.");
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
