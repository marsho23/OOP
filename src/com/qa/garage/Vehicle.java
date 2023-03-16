package com.qa.garage2;

public class Vehicle {
	
	private String colour;
	private int numberOfWheels;
	private String fuelType;
	private String vehicleType;
	private int id;


	public Vehicle() {
	}
	
	public Vehicle(int id, String colour, int numberOfWheels,String fuelType, String vehicleType) {
		this.id = id;
		this.colour = colour;
		this.numberOfWheels = numberOfWheels;
		this.fuelType = fuelType;
		this.vehicleType=vehicleType;	}

	public void driveForward() {
		System.out.println("Driving forward");
	}
	
	public void driveBackwards() {
		System.out.println("Driving backwards");
	}
	
	public void stop() {
		System.out.println("stopped");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
