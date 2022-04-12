package com.nonsense.service;

import com.nonsense.dao.UserDao;
import com.nonsense.entity.User;
import com.nonsense.exception.UserNotFoundException;

public class UserChangePassword {
	private UserDao userDao;
	
	public UserChangePassword(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void changePassword(String id, String currPwd, String newPwd) {
		User user = userDao.selectUser(id); // 유저의 정보를 가져옴
		if(user == null) { // user가 널값이면 가입되지 않은 유저이기때문에 예외발생
			throw new UserNotFoundException();
		}
		
		user.changePassword(currPwd, newPwd); // 새 비밀번호로 비밀번호를 교체한다.
		userDao.updateUser(user);
	}
}
