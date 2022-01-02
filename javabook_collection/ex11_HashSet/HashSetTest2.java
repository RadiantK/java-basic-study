package ex11_HashSet;

import java.util.*;

public class HashSetTest2 {

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {

//		Set set = new HashSet();
//		
//		for (int i=0; set.size() < 6; i++) {
//			int num =(int)(Math.random()*45)+1;
//			set.add(num); // new Integer(num);
//		}
//		System.out.println(set);
//		
//		// Set, Map는 순서가 없기때문에 정렬을 하기 위해선 리스트에 set요소 전부 저장
//		// sort의 매개변수로는 list만 올 수 있음
//		List list = new LinkedList(set);
//		Collections.sort(list);
//		System.out.println(list);
		
		Set set = new HashSet();
		
		for(int i=0; set.size()<10; i++) {
			int j = (int)(Math.random()*45)+1;
			set.add(j);
		}
		System.out.println(set);
		
		TreeSet ts = new TreeSet(set);
		System.out.println(ts);
	}

}
