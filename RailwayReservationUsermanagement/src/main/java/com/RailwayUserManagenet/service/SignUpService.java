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

	public void addUser(UserSignUp userSignUp) {
		userSignUpRepository.save(userSignUp);
	}

	public List<UserSignUp> getuser() {
		List<UserSignUp> s = userSignUpRepository.findAll();
		return s;
	}

	public void updateInventory(int id, UserSignUp userSignUp) {
		userSignUpRepository.save(userSignUp);
	}

	public void deleteUser(int id) {
		userSignUpRepository.deleteById(id);
	}

}
