package ch11_Iterator2;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
		Iterator<Member> ir = arrayList.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "를 확인할 수 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println("");
	}
	
	
}
