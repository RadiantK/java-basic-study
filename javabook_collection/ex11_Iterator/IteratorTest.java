package ex11_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		// iterator�� 1ȸ��
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
//		for(int i=0; i<list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
	}

}
