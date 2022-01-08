package ex11_HashMap;

import java.util.*;

public class HashMapTest2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put("최강록", 100);
		map.put("이연복", 90);
		map.put("정창욱", 70);
		map.put("정창욱", 80);
		map.put("최현석", 100);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+e.getKey()+ ", 점수 : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자명단 : " + set);
		
		Collection values = map.values();
		System.out.println("참가자 점수 : " + values);
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			int i = (int)(it.next());
			total += i;
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}

}
