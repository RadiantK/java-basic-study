package ex9_Auto_un_boxing;

import java.util.ArrayList;

public class AutoBoxingUnBoxingTest {

	@SuppressWarnings("removal")
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(new Integer(100));
		list.add(100); // JDK 1.5�������� ����
		
//		Integer i = list.get(0); // list�� ����� ù ��° ��ü�� ����
//		Integer i = list.get(0).intValue(); // intValue()�� Integer�� int�� ��ȯ
		@SuppressWarnings("unused")
		int i = list.get(0); // intValue()�� Integer�� int�� ��ȯ
		
	}

}
