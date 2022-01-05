package ch11_question;

import java.util.*;

public class MapExTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put("가나다", 100);
		map.put("기니디", 70);
		map.put("구누두", 72);
		map.put("개내대", 67);
		map.put("겨녀뎌", 80);
		
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
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(value));
		System.out.println("최저점수 : " + Collections.min(value));
	}

}
