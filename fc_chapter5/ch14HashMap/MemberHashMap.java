package ch14HashMap;

import java.util.HashMap;
import java.util.Iterator;


public class MemberHashMap {

//	key : Integer, value : Member Ű�� �ߺ�x ������ �ߺ�����
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	// put(key, value) = add
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
	}
	
	// containsKey(Key) Ű���� ���ԵǾ������� true ��ȯ �ƴϸ� false
	public boolean removeMember(int memberID) {
		
		if(hashMap.containsKey(memberID)) {
			hashMap.remove(memberID);
		}
		
		System.out.println("no element");
		return false;
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}
