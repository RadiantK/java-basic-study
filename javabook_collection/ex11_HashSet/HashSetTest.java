package ex11_HashSet;

import java.util.*;

public class HashSetTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// ���� 1�� ���� new Integer(1)�� ����� => ����ڽ�
		Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "4"};
		
		// �ߺ���� x ���� x
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
//			set.add(objArr[i]);
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
		}
		System.out.println(set);
		
		// HashSet�� ����� ��� ���
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
