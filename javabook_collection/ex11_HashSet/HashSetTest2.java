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
//		// Set, Map�� ������ ���⶧���� ������ �ϱ� ���ؼ� ����Ʈ�� set��� ���� ����
//		// sort�� �Ű������δ� list�� �� �� ����
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
