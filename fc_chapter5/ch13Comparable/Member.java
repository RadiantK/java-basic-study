package ch13Comparable;

public class Member implements Comparable<Member>{

	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberID == member.memberID) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberID;
	}

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberID + "입니다.";
	}
	
	@Override
	public int compareTo(Member member) {
			
//		if (this.memberID > member.memberID) {
//		return 1; // this.memberID가 더 클때 return값이 1이면 오름차순 -1이면 내림차순
//		}
//		else if(this.memberID < member.memberID) {
//			return -1;
//		} else {
//			return 0;
//		}
		
//		간소화
		
		return (this.memberID - member.memberID); // 오름차순
//		this.memberID에서 member.memberID값을 뺀게 양수면 오름차순 음수면 내림차순
//		return (this.memberID - member.memberID) * (-1); // 내림차순
	}
}