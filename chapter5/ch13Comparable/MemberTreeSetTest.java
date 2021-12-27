package ch13Comparable;

//import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {

//		TreeSet<String> set = new TreeSet<>();
//		
//		set.add("홍길동");
//		set.add("강감찬");
//		set.add("이순신");
//		
//		System.out.println(set);
		
		
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
		
	}

}
