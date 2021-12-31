package ex11_Collections;

import java.util.*;
// import static java.util.Collection.*; // �÷����� ��������

public class CollectionsTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list);
		
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		Collections.rotate(list, 2); // �ݽð�������� �ι� �̵�
		System.out.println(list);
		
		Collections.swap(list, 0, 2); // �ε��� 0�� 2 ��Ҹ� ��ȯ
		System.out.println(list);
		
		Collections.shuffle(list); // ����� ��ġ�� �������� ����
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder()); // ��������
		System.out.println(list);
		
		Collections.sort(list); // �������� ����
		System.out.println(list);
		
		int idx = Collections.binarySearch(list, 3); // 3�� ����� ��ġ (2��Ž���� ���ĺ��� �� ��) 
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max="+Collections.max(list));
		System.out.println("min="+Collections.min(list));
		System.out.println("min="+Collections.max(list, Collections.reverseOrder()));
		
		Collections.fill(list, 9); // ����Ʈ�� 9�� ä��
		System.out.println("list = " +list);
		
		// list�� ���� ũ���� ���ο� ����Ʈ�� �����ϰ� 2�� ä��
		List newList = Collections.nCopies(list.size(), 2);
		System.out.println("newList = "+ newList);
		
		// ������ Ȯ�� ������ true ������ false
		System.out.println(Collections.disjoint(list, newList)); 
		
		Collections.copy(list, newList); // newList�� ��Ҹ� list�� ����
		System.out.println("newList = "+ newList);
		System.out.println("list = " +list);
		
		Collections.replaceAll(list, 2, 1); // ����Ʈ�� 2�� 1�� �ٲ�
		System.out.println("list = " +list);
		
		Enumeration e = Collections.enumeration(list);
		ArrayList list2 = Collections.list(e);
		
		System.out.println("list2 = " + list2);
	}

}
