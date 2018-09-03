package com.rms.pack.service;

import org.springframework.stereotype.Service;

import com.rms.pack.dao.entity.User;

@Service
public interface IUserService {
	
	void addUser(User user);
	User getUser(String email, String password);
	boolean uniqueEmail(String name);
	
}
