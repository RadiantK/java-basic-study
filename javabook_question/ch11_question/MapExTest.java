package ch11_question;

import java.util.*;

public class MapExTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put("������", 100);
		map.put("��ϵ�", 70);
		map.put("������", 72);
		map.put("������", 67);
		map.put("�ܳ൮", 80);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("key: "+e.getKey()+", value: "+e.getValue());
		}
		set = map.keySet();
		System.out.println(set);
		
		Collection value = map.values();
		System.out.println(value);
		
		it=value.iterator();
		int total = 0;
		while(it.hasNext()) {
			total += (int)it.next();
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(value));
		System.out.println("�������� : " + Collections.min(value));
	}

}
