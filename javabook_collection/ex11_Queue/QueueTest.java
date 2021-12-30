 package ex11_Queue;

import java.util.*;

@SuppressWarnings("rawtypes")
public class QueueTest {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // 큐에 최대 5개까지만 저장되도록 함

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
				//화면으로부터 라인(문자열) 단위로 입력받음
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				
				// 입력이 빈문자열이면 반복문의 처음으로 돌아감
				if("".equals(input)) {
					continue;  
				} else if (input.equalsIgnoreCase("q")){ // 대소문자 구별안하고 비교
					System.exit(0); // 프로그램 종료
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE +"개 보여줍니다.");		
				} else if(input.equalsIgnoreCase("history")) {
					save(input); // 입력받은 명령어 저장
					
					// Queue의 기본 메서드가 너무적음 get()을 쓰기위해서 형변환
					// 참조변수 타입은 Queue지만 실제 객체는 LinkedList
					// Queue q = new LinkedList();
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					// size를 반복문이 돌때마다 호출하므로 상수값으로 바꿔줌
					for(int i=0; i< SIZE; i++) {
						System.out.println((i+1)+"."+list.get(i));
					}
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch( Exception e) {
				System.out.println("입력 오류입니다.");
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void save(String input) {
		// 입력이 빈문자열이 아니면 Queue에 저장
		if(!"".equals(input)) { // if(input!=null && !input.equals(""))
			q.offer(input);
		}
		
		// 최대 사이즈(5)를 넘으면 처음저장된 문자열 삭제
		if(q.size() > MAX_SIZE) {
			q.poll();
		}
	}
	

}

