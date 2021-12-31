package ex11_HashSet;

import java.util.*;

public class HashSetTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// 숫자 1은 원래 new Integer(1)로 써야함 => 오토박싱
		Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "4"};
		
		// 중복허용 x 순서 x
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
//			set.add(objArr[i]);
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
		}
		System.out.println(set);
		
		// HashSet에 저장된 요소 출력
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
