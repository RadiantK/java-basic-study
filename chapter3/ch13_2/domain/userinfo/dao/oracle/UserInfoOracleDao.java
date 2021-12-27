package ch13_2.domain.userinfo.dao.oracle;

import ch13_2.domain.userinfo.UserInfo;
import ch13_2.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("insert into Oracle DB userID = " + userinfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("update into Oracle DB userID = " + userinfo.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("delete from Oracle DB userID = " + userinfo.getUserID());
	}

}
