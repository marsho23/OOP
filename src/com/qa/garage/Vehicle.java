package com.qa.garage;

public class Vehicle {
	
	private String colour;
	private int numberOfWheels;
	private String fuelType;
	private String vehicleType;
	

	public Vehicle(String colour, int numberOfWheels,String fuelType, String vehicleType) {
		this.colour = colour;
		this.numberOfWheels = numberOfWheels;
		this.fuelType = fuelType;
		this.vehicleType=vehicleType;
	}
	
	public Vehicle() {
	}
	
	public void driveForward() {
		System.out.println("Driving forward");
	}
	
	public void driveBackwards() {
		System.out.println("Driving backwards");
	}
	
	public void stop() {
		System.out.println("stopped");
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
