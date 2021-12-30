package ex10_calendar_args;

import java.util.Calendar;

public class CalendarArgsTest {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Usage : java CalendarArgsTest 2020 7");
			return;
		}
		
		int year = Integer.parseInt("2020");
		int month = Integer.valueOf("7");
		int START_DAY_OF_WEEK = 0; // 1���� ����
		int END_DAY = 0; // ������ ��
		
		Calendar sDay = Calendar.getInstance(); // ������
		Calendar eDay = Calendar.getInstance(); // ������ ��
		
		sDay.set(year, month-1, 1); // �� 0~11 �̹Ƿ� 1����
		eDay.set(year, month, 1);
		
		// �������� ù������ �Ϸ縦 ���� ���� ���� ������ ���̵� (�޸��� ������ ������ �ٸ��� ������)
		// 31�� 28�� 30�Ϸ� �޸����� ������ ��¥�� �ٸ��� ������ ������ 1�Ͽ��� -1�� ����
		eDay.add(Calendar.DATE,  -1);
		
		// ù ��° ������ ���� �������� �˾Ƴ���. => �޷¿� ������ ������
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		// eDay�� ������ ��¥�� ����
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("      "+ year + "�� " + month + "��");
//		System.out.println("      "+ args[0] + "�� " + args[1] + "��");
		System.out.println(" SU MO TU WE TR FR SA ");
		
		// �ش� ���� 1���� ��� ���������� ���� ������ ���. 
        // ���� 1���� �������̶�� ������ �� �� ��´�.(�Ͽ��Ϻ��� ����) 
        for(int i=1; i < START_DAY_OF_WEEK; i++) { 
              System.out.print("   "); 
        } 
        
        // i�� 1�Ϻ��� 31�ϱ��� ���
        // n�� ������� �ľ��ؼ� �ٹٲ�
        for(int i=1, n=START_DAY_OF_WEEK ; i <= END_DAY; i++, n++) { 
        	// i�� 10���� ������ �����ڸ� ������� ǥ��
              System.out.print((i < 10)? "  "+i : " "+i ); 
              if(n%7==0) { 
            	  System.out.println(); 
              }
        } 
		
	}

}
