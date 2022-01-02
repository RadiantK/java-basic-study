package ch8_8randomNumberSearch;

import java.util.Scanner;

public class QuestionTest8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int answer = (int)(Math.random()*100)+1;
		int input = 0; // 사용자 입력을 저장할 공간
		int count = 0; // 시도횟수
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요. : ");
			
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				if(answer>input) {
					System.out.println("더 큰 수를 입력하세요.");
				} else if(answer<input) {
					System.out.println("더 작은 수를 입력하세요. ");					
				} else {
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 "+count+"번입니다.");
					sc.close();
					break; // do-while문을 벗어난다
					
				}
			} catch(Exception e) {
				System.out.println("유효하지 않은 값입니다. 다시 입력하세요.");
				continue;
			}
			
			
		} while(true);
	}

}
