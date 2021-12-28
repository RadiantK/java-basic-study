package ch13Comparator;

import java.util.Comparator;

public class Member implements Comparator<Member>{

	private int memberID;
	private String memberName;
	
	public Member() {
		
	}
	
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
		return memberName + "ȸ������ ���̵�� " + memberID + "�Դϴ�.";
	}
	
/*	@Override
	public int compareTo(Member member) { // this�� ��(Ŭ������ �������)
			
//		if (this.memberID > member.memberID) {
//		return 1; // this.memberID�� �� Ŭ�� return���� 1�̸� �������� -1�̸� ��������
//		}
//		else if(this.memberID < member.memberID) {
//			return -1;
//		} else {
//			return 0;
//		}
//		
//		����ȭ
		
		return (this.memberID - member.memberID); // ��������
//		this.memberID���� member.memberID���� ���� ����� �������� ������ ��������
//		return (this.memberID - member.memberID) * (-1); // ��������
	}
	*/

	@Override
	public int compare(Member member1, Member member2) {
		
		return (member1.memberID = member2.memberID);
//		compare�� ������ default�����ڸ� ����� ����ϴ� ��
//		(MemberTreeset)�� �����ڿ� Member ����Ѵٰ� ����
	}
}