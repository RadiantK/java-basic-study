package ch13Comparable;

//import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {

//		TreeSet<String> set = new TreeSet<>();
//		
//		set.add("ȫ�浿");
//		set.add("������");
//		set.add("�̼���");
//		
//		System.out.println(set);
		
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1005, "ȫ�浿");
		Member memberKang = new Member(1001, "������");
		Member memberKim = new Member(1002, "������");
		Member memberLee = new Member(1003, "�̼���");
		Member memberJang = new Member(1004, "�庸��");
		
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberJang);
		
		
		

		memberTreeSet.showAllMember();
		
	}

}
