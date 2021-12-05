package com.RailwayUserManagenet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RailwayUserManagenet.Repository.UserSignUpRepository;
import com.RailwayUserManagenet.model.UserSignUp;

@Service
public class SignUpService {
	
	@Autowired
	private UserSignUpRepository userSignUpRepository;
	
	public UserSignUp addUser(UserSignUp userSignUp) {
		List<UserSignUp> s=userSignUpRepository.findAll();
		return userSignUpRepository.save(userSignUp);
	}
	
	public List<UserSignUp>getuser(){
		List<UserSignUp> s=userSignUpRepository.findAll();
		return s;
	}

	public UserSignUp signUpService(UserSignUp userSignUp) {
		return userSignUpRepository.save(userSignUp);
	}
	
	public void deleteEmployee(int id) {
		userSignUpRepository.deleteById(id);
	}


}
