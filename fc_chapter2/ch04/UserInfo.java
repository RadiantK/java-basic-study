package ch04;

public class UserInfo {
	
	public String userId;
	public String userPassword;
	public String userName;
	public int phoneNumber;
	
	public void showUserInfo() {
		System.out.println("����� �ƾƵ�� " + userId + " ����� ��й�ȣ�� " + userPassword + " ����� �̸��� " + userName + " ����� ��ȭ��ȣ�� " + phoneNumber);	
	}
	
	public void setUserName(String name) {
		userName = name;
	}

}
