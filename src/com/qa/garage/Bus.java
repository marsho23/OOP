package com.qa.garage;

public class Bus extends Vehicle{
	
	private int numberOfSeats;
	private int numberOfFloors;
	
	public Bus() {
		
	}
	
	public Bus(int numberOfSeats, int numberOfFloors) {
		this.numberOfSeats = numberOfSeats;
		this.numberOfFloors = numberOfFloors;
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
