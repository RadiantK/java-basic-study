package ch12HashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberKang = new Member(1001, "������");
		Member memberKim = new Member(1002, "������");
		Member memberLee = new Member(1003, "�̼���");
		Member memberJang = new Member(1004, "�庸��");
		
		
		memberHashSet.addMember(memberKang);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberJang);
		
//		�ߺ��� ���̵��ε� ����� �ǹǷ� �ߺ������ ������������ Hashset�� ���� Ŭ���� member��
//		�Ѿ�°��� ���� ������ Ȯ�����ִ� equals, hash code�� �����ؾ���
		Member memberHong = new Member(1004, "ȫ�浿");
		memberHashSet.addMember(memberHong);

		memberHashSet.showAllMember();
	}

}
