package com.yll.ssm.service;

import com.yll.ssm.model.User;

public interface UserService {
	public User getUserById(int id) throws Exception;
	public User getUserByName(String name) throws Exception;
	public int insertUser(User user) throws Exception;
	public int deleteUser(int id) throws Exception;
	public int updateUser(User user) throws Exception;
}
