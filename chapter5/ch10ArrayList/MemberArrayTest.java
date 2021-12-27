package ch10ArrayList;

public class MemberArrayTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberKang = new Member(1001, "강감찬");
		Member memberKim = new Member(1002, "김유신");
		Member memberLee = new Member(1003, "이순신");
		Member memberJang = new Member(1004, "장보고");
		Member memberHong = new Member(1005, "홍길동");
		
		
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberJang);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberKang.getMemberID());
		memberArrayList.removeMember(memberKang.getMemberID());
		System.out.println("");
		memberArrayList.showAllMember();
	}

}
