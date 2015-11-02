package com.chatapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatapp.domain.User;
import com.chatapp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers(){
		return userRepository.getUsers();
	}
	
	public void createUser(User user){
		userRepository.createUser(user);
	}
	
	public void updateUser(User user){
		userRepository.updateUser(user);
	}

}
