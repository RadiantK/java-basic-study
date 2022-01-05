package test;

import java.util.*;

public class CollectionTest2 {

	public static void main(String[] args) {

		int result = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("1부터 100 사이의 숫자를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			try {
				if(input < result) {
					System.out.println("더 큰 수를 입력하세요.");
				} else if(input > result) {
					System.out.println("더 작은 수를 입력하세요.");
				} else {
					System.out.println("정답입니다.");
					System.out.println("시도횟수는 "+count+"번 입니다.");
					sc.close();
					break;
				}
			} catch(Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
			
		} while(true);
		
	}

}
