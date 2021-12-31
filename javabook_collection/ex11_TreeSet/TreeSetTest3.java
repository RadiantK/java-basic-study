package ex11_TreeSet;

import java.util.TreeSet;

public class TreeSetTest3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// headSet,tailSet 등은 TreeSet에만 존재하므로 Set set으로 하면 안됨
		TreeSet set = new TreeSet();
		
		int[] score = {90, 60 , 43, 12, 50, 35, 46, 75, 100};
		
		for (int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		System.out.println("50보다 큰 값 : " + set.tailSet(50));
		System.out.println("40~80 값 : " + set.subSet(40, 80));
	}

}
