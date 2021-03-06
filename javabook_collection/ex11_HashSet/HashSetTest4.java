package ex11_HashSet;

import java.util.*;

public class HashSetTest4 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = " + setB);
		
//		setA.retainAll(setB); // 교집합. 공통된 요소만 남기고 삭제
//		System.out.println(setA);
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object temp = it.next();
			if( setA.contains(temp)) {
				setKyo.add(temp);
			}
		}
		System.out.println("A ∩ B = " + setKyo);
		
		
//		setA.addAll(setB); // 합집합. setB와 공통된 요소만 남기고 삭제
//		System.out.println(setA);
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}	
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		System.out.println("A ∪ B = " + setHab);	
		
		
//		setA.removeAll(setB) // 차집합. setB와 공통된 요소를 제거
//		System.out.println(setA);
		it = setA.iterator();
		while(it.hasNext()) {
			Object temp = it.next();
			if(!setB.contains(temp)) {
				setCha.add(temp);
			}
		}
		System.out.println("A - B = " + setCha);
	}

}
