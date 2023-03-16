package com.qa.garage2;

public class Bus extends Vehicle {
	
	private int numberOfSeats;
	private int numberOfFloors;
	
	public Bus(int numberOfSeats, int numberOfFloors,int id,String colour, int numberOfWheels, String fuelType, String vehicleType) {
		super(id,colour, numberOfWheels, fuelType, vehicleType);
		// TODO Auto-generated constructor stub
		this.numberOfSeats = numberOfSeats;
		this.numberOfFloors = numberOfFloors;
	}

	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	

}
