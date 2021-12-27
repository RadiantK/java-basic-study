package ch12HashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberKang = new Member(1001, "강감찬");
		Member memberKim = new Member(1002, "김유신");
		Member memberLee = new Member(1003, "이순신");
		Member memberJang = new Member(1004, "장보고");
		
		
		memberHashSet.addMember(memberKang);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberJang);
		
//		중복된 아이디인데 출력이 되므로 중복출력이 되지않으려면 Hashset을 쓰는 클래스 member의
//		넘어온값이 나와 같은지 확인해주는 equals, hash code를 구현해야함
		Member memberHong = new Member(1004, "홍길동");
		memberHashSet.addMember(memberHong);

		memberHashSet.showAllMember();
	}

}
