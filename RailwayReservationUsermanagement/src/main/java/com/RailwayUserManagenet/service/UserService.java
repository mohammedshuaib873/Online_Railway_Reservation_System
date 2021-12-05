package com.RailwayUserManagenet.service;

import java.util.List;

import com.RailwayUserManagenet.model.TrainDetails;

public interface UserService {

	public List<TrainDetails> getAllDetails();
	
	public String pnrStatus(long pnrNo);
	
	public TrainDetails getDetailsByTrainNo(int trainNo);
	
	public List<TrainDetails> getTrainDetailsByEndPoints(String startStation,String destStation);

}

