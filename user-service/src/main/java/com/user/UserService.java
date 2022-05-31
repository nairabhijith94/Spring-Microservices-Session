package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public void addUser(UserVo user) {
		userRepo.save(user);

	}
	
	public void removeUser(Integer userId) {
		// TODO Auto-generated method stub
	 userRepo.deleteById(userId);
	}
}