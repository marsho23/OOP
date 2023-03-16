package com.qa.garage2;

public class Car extends Vehicle {
	private int numberOfDoors;
	private float engineSize;
	
	public Car() {
		
	}
	
	public Car(int numberOfDoors, float engineSize,int id, String colour, int numberOfWheels, String fuelType, String vehicleType) {
		super(id, colour, numberOfWheels, fuelType, vehicleType);
		this.numberOfDoors = numberOfDoors;
		this.engineSize = engineSize;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public float getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public int calcBill() {
		return 10;
	}
	
	
}

