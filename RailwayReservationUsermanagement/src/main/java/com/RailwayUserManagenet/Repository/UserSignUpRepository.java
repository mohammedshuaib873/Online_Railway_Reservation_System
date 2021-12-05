package com.RailwayUserManagenet.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.RailwayUserManagenet.model.UserSignUp;

	@Repository
	public interface UserSignUpRepository extends MongoRepository<UserSignUp, Integer>{
		

	}

