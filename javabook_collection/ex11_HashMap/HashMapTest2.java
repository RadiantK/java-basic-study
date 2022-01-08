package ex11_HashMap;

import java.util.*;

public class HashMapTest2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put("�ְ���", 100);
		map.put("�̿���", 90);
		map.put("��â��", 70);
		map.put("��â��", 80);
		map.put("������", 100);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : "+e.getKey()+ ", ���� : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("�����ڸ�� : " + set);
		
		Collection values = map.values();
		System.out.println("������ ���� : " + values);
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			int i = (int)(it.next());
			total += i;
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
	}

}
