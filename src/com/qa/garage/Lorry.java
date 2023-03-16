package com.qa.garage2;

public class Lorry extends Vehicle{
	private float height;
	private float cubicCapacity;
	
	public Lorry() {
	}
	
	public Lorry(float height, float cubicCapacity,int id,String colour, int numberOfWheels, String fuelType, String vehicleType) {
		super(id, colour, numberOfWheels, fuelType, vehicleType);
		this.height=height;
		this.cubicCapacity=cubicCapacity;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	
	
}
