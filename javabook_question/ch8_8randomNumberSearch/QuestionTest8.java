package ch8_8randomNumberSearch;

import java.util.Scanner;

public class QuestionTest8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int answer = (int)(Math.random()*100)+1;
		int input = 0; // ����� �Է��� ������ ����
		int count = 0; // �õ�Ƚ��
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ���. : ");
			
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				if(answer>input) {
					System.out.println("�� ū ���� �Է��ϼ���.");
				} else if(answer<input) {
					System.out.println("�� ���� ���� �Է��ϼ���. ");					
				} else {
					System.out.println("������ϴ�.");
					System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
					sc.close();
					break; // do-while���� �����
					
				}
			} catch(Exception e) {
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			
			
		} while(true);
	}

}
