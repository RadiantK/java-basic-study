package ex11_Collections;

import java.util.*;
// import static java.util.Collection.*; // 컬렉션즈 생략가능

public class CollectionsTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list);
		
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		Collections.rotate(list, 2); // 반시계방향으로 두번 이동
		System.out.println(list);
		
		Collections.swap(list, 0, 2); // 인덱스 0과 2 요소를 교환
		System.out.println(list);
		
		Collections.shuffle(list); // 요소위 위치를 무작위로 변경
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder()); // 역순정렬
		System.out.println(list);
		
		Collections.sort(list); // 오름차순 정렬
		System.out.println(list);
		
		int idx = Collections.binarySearch(list, 3); // 3이 저장된 위치 (2진탐색은 정렬부터 할 것) 
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max="+Collections.max(list));
		System.out.println("min="+Collections.min(list));
		System.out.println("min="+Collections.max(list, Collections.reverseOrder()));
		
		Collections.fill(list, 9); // 리스트를 9로 채움
		System.out.println("list = " +list);
		
		// list와 같은 크기의 새로운 리스트를 생성하고 2로 채움
		List newList = Collections.nCopies(list.size(), 2);
		System.out.println("newList = "+ newList);
		
		// 공통요소 확인 없으면 true 있으면 false
		System.out.println(Collections.disjoint(list, newList)); 
		
		Collections.copy(list, newList); // newList의 요소를 list에 복사
		System.out.println("newList = "+ newList);
		System.out.println("list = " +list);
		
		Collections.replaceAll(list, 2, 1); // 리스트의 2를 1로 바꿈
		System.out.println("list = " +list);
		
		Enumeration e = Collections.enumeration(list);
		ArrayList list2 = Collections.list(e);
		
		System.out.println("list2 = " + list2);
	}

}
