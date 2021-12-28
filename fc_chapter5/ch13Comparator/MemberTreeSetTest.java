package ch13Comparator;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2) * (-1);
	}
	
}

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
/*		
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
		*/
		
		
		TreeSet<String> set = new TreeSet<>(new MyCompare());
		
		set.add("ȫ�浿");
		set.add("������");
		set.add("�̼���");
		
		System.out.println(set);
		
	}

}
