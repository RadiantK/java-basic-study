package ch14_if;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int age = sc.nextInt();
		sc.close();
		
		if(age >= 8) {
			System.out.println("�б��� �ٴմϴ�.");
		}
		else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		System.out.println("��°� ���� ����.");
	}

}
