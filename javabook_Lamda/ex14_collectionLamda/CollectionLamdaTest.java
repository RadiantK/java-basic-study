package ex14_collectionLamda;

import java.util.*;

public class CollectionLamdaTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0; i<10; i++) {
			list.add(i);
		}
		
		list.forEach(i->System.out.print(i+", "));
		System.out.println();
		System.out.println(list);
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next()+", ");		
//		}
		list.removeIf(x-> x % 2 == 0 || x % 3 == 0); // 2또는 3의 배수 제거
		System.out.println(list);
		
		list.replaceAll(i->i*10); // 리스트의 i값을 i*10으로 교체
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		map.forEach((k, v) -> System.out.print("["+k+", "+v+"]"));
		System.out.println();
		
		Iterator it2 = map.entrySet().iterator();
		while(it2.hasNext()) {
			Map.Entry e = (Map.Entry)it2.next();
			System.out.print("["+e.getKey()+", "+e.getValue()+"]");
		}
	}

}

