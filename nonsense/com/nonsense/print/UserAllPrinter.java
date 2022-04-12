package com.nonsense.print;

import java.util.Collection;

import com.nonsense.dao.UserDao;
import com.nonsense.entity.User;

public class UserAllPrinter {
	
	private UserDao userDao;
	
	// %t는 Calendar클래스의 데이터를 출력하는 형식
	// %tF 현재의 날짜를 %tY-%tm-%td(년/월/일) 형식으로 출력
	public void printAll() {
		Collection<User> users = userDao.userList();
		System.out.println("<< 전체 유저 정보 >>");
		users.stream()
		.sorted((u1, u2) ->  u1.getId().compareTo(u2.getId()))
		.forEach(user -> 
			System.out.printf("[ 유저정보 : 아이디=%s, 이름=%s, 이메일=%s, 가입일=%tF ]\n",
			user.getId(), user.getName(), user.getEamil(), user.getRegDate()));
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
