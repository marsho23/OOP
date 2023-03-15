package com.qa.garage;
import java.util.ArrayList;
import java.util.List;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle v1 = new Vehicle("blue",4,"petrol","car");
		//Vehicle v2 = new Vehicle("red",2,"petrol","");
		Car c1 = new Car();
		c1.setColour("blue");
		c1.setEngineSize(1.1f);
		c1.setFuelType("petrol");
		c1.setNumberOfDoors(4);
		c1.setNumberOfWheels(4);
		c1.setVehicleType("car");
		
		Lorry l1 = new Lorry();
		l1.setColour("red");
		l1.setFuelType("diesel");
		l1.setNumberOfWheels(4);
		l1.setVehicleType("lorry");
		l1.setCubicCapacity(65);
		l1.setHeight(5);
		
		Bus b1 = new Bus();
		b1.setColour("white");
		b1.setFuelType("diesel");
		b1.setNumberOfWheels(4);
		b1.setVehicleType("bus");
		b1.setNumberOfFloors(2);
		b1.setNumberOfSeats(50);
		
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(c1);
		vehicles.add(b1);
		vehicles.add(l1);
		
		for (Vehicle vehicle:vehicles) {
			System.out.println(vehicle.getVehicleType());
		}
		
	}

}
