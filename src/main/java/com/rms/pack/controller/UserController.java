package com.rms.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rms.pack.dao.entity.User;
import com.rms.pack.dto.UserLoginDto;
import com.rms.pack.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public String login(@RequestBody UserLoginDto user) {
		User u = userService.getUser(user.getEmail(), user.getPassword());
		if (u != null) {
			
		}
		return null;
	}

}
