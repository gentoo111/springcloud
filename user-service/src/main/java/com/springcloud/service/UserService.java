package com.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.mapper.UserMapper;
import com.springcloud.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public List<User> findAllUsers() {
		return userMapper.findAllUsers();
	}

}
