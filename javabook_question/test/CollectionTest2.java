package test;

import java.util.*;

public class CollectionTest2 {

	public static void main(String[] args) {

		int result = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("1���� 100 ������ ���ڸ� �Է��ϼ���.");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			try {
				if(input < result) {
					System.out.println("�� ū ���� �Է��ϼ���.");
				} else if(input > result) {
					System.out.println("�� ���� ���� �Է��ϼ���.");
				} else {
					System.out.println("�����Դϴ�.");
					System.out.println("�õ�Ƚ���� "+count+"�� �Դϴ�.");
					sc.close();
					break;
				}
			} catch(Exception e) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			}
			
		} while(true);
		
	}

}
