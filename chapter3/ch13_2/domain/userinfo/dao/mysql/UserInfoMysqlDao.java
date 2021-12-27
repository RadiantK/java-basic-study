package ch13_2.domain.userinfo.dao.mysql;

import ch13_2.domain.userinfo.UserInfo;
import ch13_2.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into MySQL DB userID = " + userInfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into MySQL DB userID = " + userInfo.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete fron MySQL DB userID = " + userInfo.getUserID());
	}



}
