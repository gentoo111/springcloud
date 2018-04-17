package com.springcloud.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.model.User;
import com.springcloud.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// http://localhost:8770/findAllUsers
	@RequestMapping("/findAllUsers")
	public List<User> findAllUsers() {
		return userService.findAllUsers();
	}

}
