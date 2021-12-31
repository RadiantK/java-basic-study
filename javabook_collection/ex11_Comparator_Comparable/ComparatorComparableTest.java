package ex11_Comparator_Comparable;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("rawtypes")
class Descending implements Comparator {
	
	@SuppressWarnings("unchecked")
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
//			return c2.compareTo(c1); // 같음
		}
		return -1;
	}
}

public class ComparatorComparableTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		String[] strArr = {"cat", "Dog", "lion", "tiger"};
//		Arrays.sort(정렬할 내용, 정렬기준);
		
		Arrays.sort(strArr); // String의 자체Comparable구현에 의한 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); // 역순 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
		
	}
	

}
