package com.nonsense.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.nonsense.entity.User;

public class UserDao {
	private Map<String, User> map = new HashMap<>();
	
	public Collection<User> userList(){
		return map.values();
	}
	
	public User selectUser(String id) {
		return map.get(id);
	}
	
	public void insertUser(User user) {
		map.put(user.getId(), user);
	}
	
	public void updateUser(User user) {
		map.put(user.getId(), user);
	}
	
	public void removeUser(User user) {
		map.remove(user.getId());
	}
}
