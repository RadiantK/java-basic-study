package ch04;

public class UserInfo {
	
	public String userId;
	public String userPassword;
	public String userName;
	public int phoneNumber;
	
	public void showUserInfo() {
		System.out.println("사용자 아아디는 " + userId + " 사용자 비밀번호는 " + userPassword + " 사용자 이름은 " + userName + " 사용자 전화번호는 " + phoneNumber);	
	}
	
	public void setUserName(String name) {
		userName = name;
	}

}
