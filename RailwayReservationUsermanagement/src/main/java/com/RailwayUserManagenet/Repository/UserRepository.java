package com.RailwayUserManagenet.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.RailwayUserManagenet.model.TrainDetails;

@Repository
public interface UserRepository extends MongoRepository<TrainDetails,Integer>	{	

}
