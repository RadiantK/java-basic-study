package ex4_WhereNum;

import java.util.Scanner;

public class WhereNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int random = (int)(Math.random()*100)+1;
		int count =0;
		int input =0;
		
		do {
			count++;
			System.out.println("1부터 100까지의 숫자를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			
			if(input > random) {
				System.out.println("입력이 큰 수입니다 . 더 작은수를 입력하세요");
			} else if (input < random) {
				System.out.println("입력이 더 작은수입니다. 더 큰 수를 입력하세요.");
			} else {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수는 "+count+"번 입니다.");
				sc.close();
				break;
				
			}
		} while(true);
	}

}
