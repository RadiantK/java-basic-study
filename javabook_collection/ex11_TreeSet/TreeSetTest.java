package ex11_TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {

		// HashSet는 자동정렬이 안되서 LinkedList로 옮겨서 정렬해야 하지만
		// TreeSet는 자동정렬
		Set set = new TreeSet();
		
		for (int i=0; set.size() < 6; i++) {
			int num =(int)(Math.random()*45)+1;
			set.add(num); // new Integer(num);
		}
		System.out.println(set);
		System.out.println();
		
		
		Set set2 = new TreeSet(new TestComp());
		
		set2.add(new Test());
		System.out.println(set2);
	}

}

class Test {}

@SuppressWarnings("rawtypes")
class TestComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
	
}