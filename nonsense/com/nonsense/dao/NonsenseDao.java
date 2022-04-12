package com.nonsense.dao;

import java.util.ArrayList;
import java.util.List;

import com.nonsense.entity.NonsenseUser;

public class NonsenseDao {

	private List<NonsenseUser> list = new ArrayList<>();
	
	public List<NonsenseUser> userList() {
		return list;
	}
	
	public void insertUser(NonsenseUser user) {
		list.add(user);
	}
	
	public void removeUser(int idx) {
		list.remove(idx);
	}
	
}
