package com.rms.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.pack.dao.entity.User;
import com.rms.pack.dao.repository.IRestaurantRepo;
import com.rms.pack.dao.repository.IUserRepo;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserRepo userRepo;
	
	@Autowired
	IRestaurantRepo restRepo;

	@Override
	public void addUser(User user) {
		if(restRepo.findByRestaurantName(user.getRestaurant().getRestaurantName()) == null)
			restRepo.save(user.getRestaurant());
		userRepo.save(user);
	}

	@Override
	public User getUser(String email, String password) {
		return userRepo.findByEmailAndPassword(email, password);
	}

	@Override
	public boolean uniqueEmail(String name) {
		return userRepo.findByEmail(name) == null;
	}

}
