package com.RailwayUserManagenet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.RailwayUserManagenet.model.UserSignUp;
import com.RailwayUserManagenet.service.SignUpService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserManagementController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private SignUpService signUpService;

	@PostMapping("/signup")
	@ApiOperation(value = "To Add User Details")
	public UserSignUp saveUser(@RequestBody UserSignUp userSignUp) {
		return signUpService.addUser(userSignUp);
	}

	@GetMapping("/allusers")
	@ApiOperation(value = "To Get All The User Details")
	public List<UserSignUp> findAllUsers() {
		return signUpService.getuser();
	}

	@PutMapping("/update")
	@ApiOperation(value = "To Update User Details")
	public UserSignUp updateUser(@RequestBody UserSignUp userSignUp) {
		return signUpService.signUpService(userSignUp);
	}

	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "To Delete User Details")
	public void deleteEmployee(@RequestParam("id") int id) {
		signUpService.deleteEmployee(id);
	}

}
