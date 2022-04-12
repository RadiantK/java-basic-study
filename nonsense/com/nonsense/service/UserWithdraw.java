package com.nonsense.service;

import java.util.List;

import com.nonsense.dao.NonsenseDao;
import com.nonsense.dao.UserDao;
import com.nonsense.entity.NonsenseUser;
import com.nonsense.entity.User;
import com.nonsense.exception.UserNotFoundException;
import com.nonsense.exception.WrongPasswordException;

public class UserWithdraw {

	private UserDao userDao;
	private NonsenseDao nonsenseDao;
	
	public UserWithdraw(UserDao userDao, NonsenseDao nonsenseDao) {
		this.userDao = userDao;
		this.nonsenseDao = nonsenseDao;
	}
	
	// 회원탈퇴
	public void withdraw(String id, String password) {
		User user = userDao.selectUser(id);
		if(user == null) { // 회원목록에 아이디가 있는지 확인
			throw new UserNotFoundException();
		}
		if(!user.getPassword().equals(password)) { // 비밀번호 일치여부 확인
			throw new WrongPasswordException();
		}
		List<NonsenseUser> list = nonsenseDao.userList();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(user.getId())) {
				nonsenseDao.removeUser(i);
			}
			
		}
		userDao.removeUser(user); // 회원 제거
	}
}
