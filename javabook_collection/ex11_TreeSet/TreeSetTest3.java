package ex11_TreeSet;

import java.util.TreeSet;

public class TreeSetTest3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// headSet,tailSet ���� TreeSet���� �����ϹǷ� Set set���� �ϸ� �ȵ�
		TreeSet set = new TreeSet();
		
		int[] score = {90, 60 , 43, 12, 50, 35, 46, 75, 100};
		
		for (int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println("50���� ���� �� : " + set.headSet(50));
		System.out.println("50���� ū �� : " + set.tailSet(50));
		System.out.println("40~80 �� : " + set.subSet(40, 80));
	}

}
