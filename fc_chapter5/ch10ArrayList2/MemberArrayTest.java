package ch10ArrayList2;

public class MemberArrayTest {

	public static void main(String[] args) {

		Member memberK = new Member(1001, "Kang");
		Member memberL = new Member(1002, "Lang");
		Member memberT = new Member(1003, "Tang");
		Member memberH = new Member(1004, "Hang");
		
		MemberArrayList arrayList = new MemberArrayList();
		
		arrayList.addMember(memberK);
		arrayList.addMember(memberL);
		arrayList.addMember(memberT);
		arrayList.addMember(memberH);
		
		arrayList.showAllMember();
		
		arrayList.removeMember(memberL.getMemberID());
		arrayList.removeMember(memberL.getMemberID());
		arrayList.removeMember(1003);
		
		arrayList.showAllMember();
		
		
	}

}
