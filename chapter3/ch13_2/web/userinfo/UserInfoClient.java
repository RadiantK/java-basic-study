package ch13_2.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13_2.domain.userinfo.UserInfo;
import ch13_2.domain.userinfo.dao.UserInfoDao;
import ch13_2.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13_2.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");
	
		Properties prop = new Properties();
		prop.load(fis);
			
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID("1000");
		userInfo.setUserName("Kim");
		userInfo.setUserPassword("101010");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoMysqlDao();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
