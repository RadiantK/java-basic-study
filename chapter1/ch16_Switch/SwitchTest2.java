package ch16_Switch;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		sc.close();
		
		int day = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.println("�̹����� 31�� ���� �Դϴ�.");
				yield 31;
			}
			case 2->
				28;
			case 4, 6, 9, 11->
				30;
			default -> {
				System.out.println("�������� �ʴ� �� �Դϴ�.");
				yield -1;
			}
		};
		
		System.out.println(month + "����" + day + "�� �Դϴ�.");
	}

}