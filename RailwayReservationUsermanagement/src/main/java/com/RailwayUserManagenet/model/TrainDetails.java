package com.RailwayUserManagenet.model;

//user model

public class TrainDetails {
	private int trainNo;
	private String trainName;
	private String sourceStation;
	private String destinationStation;
	private String arravialTime;
	private String departureTime;
	private String duration;
	private int noOfSeats;
	private int firstClassFare;
	private int twoTierFare;
	private int threeTierFare;
	private int sleeperClassFare;
	public TrainDetails() {
		super();
		
	}
	public TrainDetails(int trainNo, String trainName, String sourceStation, String destinationStation,
			String arravialTime, String departureTime, String duration, int noOfSeats, int firstClassFare,
			int twoTierFare, int threeTierFare, int sleeperClassFare) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.arravialTime = arravialTime;
		this.departureTime = departureTime;
		this.duration = duration;
		this.noOfSeats = noOfSeats;
		this.firstClassFare = firstClassFare;
		this.twoTierFare = twoTierFare;
		this.threeTierFare = threeTierFare;
		this.sleeperClassFare = sleeperClassFare;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	public String getArravialTime() {
		return arravialTime;
	}
	public void setArravialTime(String arravialTime) {
		this.arravialTime = arravialTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getFirstClassFare() {
		return firstClassFare;
	}
	public void setFirstClassFare(int firstClassFare) {
		this.firstClassFare = firstClassFare;
	}
	public int getTwoTierFare() {
		return twoTierFare;
	}
	public void setTwoTierFare(int twoTierFare) {
		this.twoTierFare = twoTierFare;
	}
	public int getThreeTierFare() {
		return threeTierFare;
	}
	public void setThreeTierFare(int threeTierFare) {
		this.threeTierFare = threeTierFare;
	}
	public int getSleeperClassFare() {
		return sleeperClassFare;
	}
	public void setSleeperClassFare(int sleeperClassFare) {
		this.sleeperClassFare = sleeperClassFare;
	}
	@Override
	public String toString() {
		return "TrainDetails [trainNo=" + trainNo + ", trainName=" + trainName + ", sourceStation=" + sourceStation
				+ ", destinationStation=" + destinationStation + ", arravialTime=" + arravialTime + ", departureTime="
				+ departureTime + ", duration=" + duration + ", noOfSeats=" + noOfSeats + ", firstClassFare="
				+ firstClassFare + ", twoTierFare=" + twoTierFare + ", threeTierFare=" + threeTierFare
				+ ", sleeperClassFare=" + sleeperClassFare + "]";
	}
	
	

}
 