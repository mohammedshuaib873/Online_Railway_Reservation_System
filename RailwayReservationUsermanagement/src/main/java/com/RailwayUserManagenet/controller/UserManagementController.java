package com.RailwayUserManagenet.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.RailwayUserManagenet.model.TrainDetails;
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
	public String saveUser(@RequestBody UserSignUp userSignUp) {
		this.signUpService.addUser(userSignUp);
		return "User Added Successfully With Id " + userSignUp.getId();
	}

	@GetMapping("/allusers")
	@ApiOperation(value = "To Get All The User Details")
	public List<UserSignUp> findAllUsers() {
		return signUpService.getuser();
	}

	@PutMapping("/update/{id}")
	@ApiOperation(value = "To Update User Details")
	public String updateInventory(@RequestBody UserSignUp userSignUp, @PathVariable int id) {
		this.signUpService.updateInventory(id, userSignUp);
		return "Updated User with id " + id;
	}

	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "To Delete User Details")
	public String deleteUser(@PathVariable int id) {
		this.signUpService.deleteUser(id);
		return "Deleted User With id " + id;
	}
	
	@GetMapping("/traindetails/{id}")
	@ApiOperation(value = "To Get Train Details")
	public List<TrainDetails> getTrainDetails(@PathVariable("id") int id)
	{
		return Collections.singletonList(
		      new TrainDetails(1,"LalBagh","Vellore","Bangalore","3pm","7pm","4hrs",3,1,2,0,0)
	    );
		
	}

}
