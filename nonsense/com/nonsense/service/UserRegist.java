package com.nonsense.service;

import java.time.LocalDateTime;

import com.nonsense.dao.UserDao;
import com.nonsense.entity.User;
import com.nonsense.exception.UserDuplicationException;

public class UserRegist {

	private UserDao userDao;
	
	public UserRegist(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void regist(User requestUser) {
		User user = userDao.selectUser(requestUser.getId());
		if(user != null) { // 유저가 널값이 아니면 중복된 아이디가 있기때문에 예외
			throw new UserDuplicationException();
		}
		
		User newUser = new User( // 신규 멤버 생성
				requestUser.getId(), requestUser.getPassword(),
				requestUser.getName(), requestUser.getEamil(),
				LocalDateTime.now());
		userDao.insertUser(newUser);
	}
}
