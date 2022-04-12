package com.nonsense.print;

import com.nonsense.dao.UserDao;
import com.nonsense.entity.User;
import com.nonsense.exception.UserNotFoundException;
import com.nonsense.exception.WrongPasswordException;

public class UserSelectPrinter {

	private UserDao userDao;
	
	public void selectPrint(String id, String password) {
		User user = userDao.selectUser(id);
		if(user == null) {
			throw new UserNotFoundException();
		}
		if(!user.getPassword().equals(password)) {
			throw new WrongPasswordException();
		}
		System.out.println("<< 내 정보 확인 >>");
		System.out.printf("[ 아이디=%s, 비밀번호=%s, 이름=%s, 이메일=%s, 가입일=%tF ]\n",
				user.getId(), user.getPassword(), user.getName(),
				user.getEamil(), user.getRegDate());
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
