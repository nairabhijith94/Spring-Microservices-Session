package com.user.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.UserService;
import com.user.UserVo;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("user")
	public void adduser(@Valid @RequestBody UserVo user) {
		userService.addUser(user);

	}

	@DeleteMapping("user")
	public void removeUser(@RequestBody Integer userId) {
		// TODO Auto-generated method stub
		userService.removeUser(userId);
	}
}
