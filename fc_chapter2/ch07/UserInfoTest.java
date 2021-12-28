package ch07;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userKang = new UserInfo();
		userKang.userId = "asd123";
		userKang.userPassword = "zxc321";
		userKang.userName = "Kang";
		userKang.phoneNumber = "01012345678";
		userKang.userAdress = "seoul, korea";
		
		System.out.println(userKang.showUserInfo());
		
		UserInfo userKim = new UserInfo("asd456", "zxc456", "Kim");
		System.out.println(userKim.showUserInfo());
	}

}
