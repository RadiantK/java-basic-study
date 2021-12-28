package ch13_2.domain.userinfo.dao;

import ch13_2.domain.userinfo.UserInfo;

public interface UserInfoDao {

	void insertUserInfo(UserInfo userinfo);
	void updateUserInfo(UserInfo userinfo);
	void deleteUserInfo(UserInfo userinfo);
}
