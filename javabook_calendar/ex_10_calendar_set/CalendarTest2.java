package ex_10_calendar_set;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {

		final String[] DAY_OF_WEEK =  {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2019, 3, 29); // 2019�� 4�� 29�� ����
		System.out.println("data1�� "+ toString(date1)+ "��"+"�����̰�,");
		System.out.println("����(data2)�� "+ toString(date2)
			+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"�����Դϴ�.");
		
		// �� ��¥���� ���̸� ��������, getTimeMillis() õ���� ���� ������ ��ȯ�ؾ� �Ѵ�.
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("�� ��(date1)���� ����(date2)���� " + difference + "�ʰ� �������ϴ�.");
		System.out.println("��(day)�� ����ϸ� " + difference/(24*60*60) + "���Դϴ�.");
//		1�� = 24*60*60
	}

	private static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"��"+(date.get(Calendar.MONTH)+1)
				+ "��" + date.get(Calendar.DATE)+ "��";
	}

}
