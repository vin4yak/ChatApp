package com.chatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chatapp.domain.User;
import com.chatapp.service.UserService;

@RequestMapping(value="/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void createUser(@RequestBody(required=true) User user){
		userService.createUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void updateUser(@RequestBody(required=true) User user){
		userService.updateUser(user);
	}
}
 