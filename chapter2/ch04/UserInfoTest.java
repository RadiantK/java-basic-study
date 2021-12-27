package ch04;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userInfoKim = new UserInfo();
		
		userInfoKim.userId = "kim00";
		userInfoKim.userPassword = "asdf";
		userInfoKim.setUserName("Kim");
		userInfoKim.phoneNumber = 0123456;
		
		userInfoKim.showUserInfo();
		System.out.println(userInfoKim);
	}

}
