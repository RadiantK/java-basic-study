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
			System.out.println("1���� 100������ ���ڸ� �Է��ϼ���.");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			
			if(input > random) {
				System.out.println("�Է��� ū ���Դϴ� . �� �������� �Է��ϼ���");
			} else if (input < random) {
				System.out.println("�Է��� �� �������Դϴ�. �� ū ���� �Է��ϼ���.");
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ���� "+count+"�� �Դϴ�.");
				sc.close();
				break;
				
			}
		} while(true);
	}

}
