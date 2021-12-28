package ch10ArrayList;

public class MemberArrayTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberKang = new Member(1001, "������");
		Member memberKim = new Member(1002, "������");
		Member memberLee = new Member(1003, "�̼���");
		Member memberJang = new Member(1004, "�庸��");
		Member memberHong = new Member(1005, "ȫ�浿");
		
		
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
