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
//			return c2.compareTo(c1); // ����
		}
		return -1;
	}
}

public class ComparatorComparableTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		String[] strArr = {"cat", "Dog", "lion", "tiger"};
//		Arrays.sort(������ ����, ���ı���);
		
		Arrays.sort(strArr); // String�� ��üComparable������ ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // ��ҹ��� ���о���
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); // ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));
		
	}
	

}
