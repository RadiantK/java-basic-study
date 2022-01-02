package ex11_HashMap;

import java.util.*;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class HashMapTest4 {	
	
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		
		addPhoneNum("친구", "김유신", "010-1111-1111");
		addPhoneNum("친구", "김유신", "010-2222-2222");
		addPhoneNum("친구", "김유신", "010-3333-3333");
		addPhoneNum("직장", "김대리", "010-4444-4444");
		addPhoneNum("직장", "이과장", "010-5555-1111");
		addPhoneNum("직장", "박부장", "010-6666-6666");
		addPhoneNum("세탁", "010-7777-7777");
		
		printList();
		
	}
	
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	static void addPhoneNum(String groupName, String name, String tell) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tell, name); // 이름은 중복될 수 있기때문에 키값을 전화번호로함
	}
	
	static void addPhoneNum(String name, String tell) {
		addPhoneNum("기타", name, tell);
	}
	
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
//			System.out.println(e);
			Set subSet = ((HashMap)e.getValue()).entrySet();
//			System.out.println(subSet);
			Iterator subIt = subSet.iterator();
			
			System.out.println("*"+e.getKey()+"["+subSet.size()+"]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String tellnum = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " / " + tellnum);
			}
			System.out.println();
		}
		
	}

}
