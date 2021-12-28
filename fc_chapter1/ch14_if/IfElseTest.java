package ch14_if;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		sc.close();
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		System.out.println("노는게 제일 좋아.");
	}

}
