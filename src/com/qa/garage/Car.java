package com.qa.garage;

public class Car extends Vehicle {
	private int numberOfDoors;
	private float engineSize;
	
	public Car() {
		
	}
	
	//public Car(int numberOfDoors, float engineSize) {
		//this.numberOfDoors = numberOfDoors;
		//this.engineSize = engineSize;
	//}

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
	
	
}
