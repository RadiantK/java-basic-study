package ex11_ArrayList;

import java.util.*;

public class ArrayListTest2 {
	
	@SuppressWarnings("rawtypes")
	void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayListTest2 al = new ArrayListTest2();
		
		ArrayList al1 = new ArrayList(); 
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(5);
		al1.add(4);
		al1.add(0);
		
		ArrayList al2 = new ArrayList(al1.subList(1, 4));
		
		al.print(al1, al2);
		
		Collections.sort(al1);
		Collections.sort(al2);
		
		al.print(al1, al2);
		
		System.out.println(al1.containsAll(al2));
		
		al2.add("B");
		al2.add("C");
		
		al.print(al1, al2);
		
		al2.set(3, "AA");
		al.print(al1, al2);
		
		al2.set(3,"CC");
		al.print(al1, al2);
		
		al1.remove(0);
		al.print(al1, al2);
		
		System.out.println(al1.retainAll(al2));
		al.print(al1, al2);
		
		for (int i=al2.size()-1; i>=0; i-- ) {
			if(al1.contains(al2.get(i))) {
				al2.remove(i);
			}
		}
		al.print(al1, al2);
	}

}
