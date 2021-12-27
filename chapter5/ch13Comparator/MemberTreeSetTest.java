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
		
		Member memberHong = new Member(1005, "홍길동");
		Member memberKang = new Member(1001, "강감찬");
		Member memberKim = new Member(1002, "김유신");
		Member memberLee = new Member(1003, "이순신");
		Member memberJang = new Member(1004, "장보고");
		
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberJang);

		memberTreeSet.showAllMember();
		*/
		
		
		TreeSet<String> set = new TreeSet<>(new MyCompare());
		
		set.add("홍길동");
		set.add("강감찬");
		set.add("이순신");
		
		System.out.println(set);
		
	}

}
