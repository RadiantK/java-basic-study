package ex11_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class ArrayListTest {
	
	void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}

	public static void main(String[] args) {

		ArrayListTest at = new ArrayListTest();	
		
		ArrayList list1 = new ArrayList();
		
		// ArrayList에는 객체만 저장가능
		// 오토방싱으로인해서 기본형이 참조형으로 자동 변환
//		list1.add(new Integer(1));
		list1.add(1);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(2);
		list1.add(0);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		at.print(list1, list2);
		
		// Collection은 인터페이스, Collections는 유틸 클래스
		Collections.sort(list1);
		Collections.sort(list2);
		at.print(list1, list2);
		
		// list1이 list2의 모든요소를 포함하는가
		System.out.println("list1.containsAll(list2)"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		// 중간에 끼워 넣는것(자리이동)은 부담이 감
		list2.add(3,"A");
		at.print(list1, list2);
		
		list2.set(3, "AA");
		at.print(list1, list2);
		
		list1.add(0, "1"); // 문자 1
		// indexOf()는 지정된 객체의 위치를 알려줌
		System.out.println("index= "+list1.indexOf(1));
		
		list1.remove(0); // 0번째 index를 지움 => 문자 1 제거
//		list1.remove(new Integer(1)); // 숫자 1을 지움
		
		at.print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 삭제
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));
		at.print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}		
		}
		at.print(list1, list2);		
	}
	
}
