package com.RailwayUserManagenet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.RailwayUserManagenet.Repository.UserRepository;
import com.RailwayUserManagenet.model.TrainDetails;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public List<TrainDetails> getAllDetails() {
		return null;
	}

	@Override
	public String pnrStatus(long pnrNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainDetails getDetailsByTrainNo(int trainNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrainDetails> getTrainDetailsByEndPoints(String startStation, String destStation) {
		// TODO Auto-generated method stub
		return null;
	}
    
	
	

}
