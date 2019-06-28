package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.service.UserService;
import com.bean.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userDao;
	
	public User getUserById(int userId) {
		
		return this.userDao.selectByPrimaryKey(userId);
	}

}
