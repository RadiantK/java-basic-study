package ch10ArrayList2;

public class Member {

	private int MemberID;
	private String MemberName;
	
	public Member(int MemberID, String MemberName) {
		this.MemberID = MemberID;
		this.MemberName = MemberName;
	}

	public int getMemberID() {
		return MemberID;
	}

	public void setMemberID(int memberID) {
		MemberID = memberID;
	}

	public String getMemberName() {
		return MemberName;
	}

	public void setMemberName(String memberName) {
		MemberName = memberName;
	}

	@Override
	public String toString() {
		return MemberName + "님의 아이디는 " + MemberID + "입니다.";
	}
	
	
}
